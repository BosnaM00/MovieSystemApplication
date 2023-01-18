import { Component, OnInit } from '@angular/core';
import {User} from "../user";
import {RegisterService} from "../register.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  user:User = new User();

  constructor(private registerService: RegisterService,
              private router: Router) { }

  ngOnInit(): void {
  }
  userRegister(){
    console.log(this.user);
    this.registerService.registerUser(this.user).subscribe(data=>{
      this.goToCheckEmailScreen();
    });

    //, error=>alert("User is not register")
  }

  goToCheckEmailScreen() {
    this.router.navigate(['/checkEmail']);
  }


}
