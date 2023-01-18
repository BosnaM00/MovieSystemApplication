import { Component, OnInit } from '@angular/core';
import {User} from "../user";
import {RegisterService} from "../register.service";
import {Login} from "../login";
import {CommonUtil} from "../services/commonUtil";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login-book',
  templateUrl: './login-book.component.html',
  styleUrls: ['./login-book.component.css']
})
export class LoginBookComponent implements OnInit {

  login:Login = new Login();

  constructor(private registerService: RegisterService,
              private commonUtil: CommonUtil,
              private router: Router) { }

  ngOnInit(): void {
  }

  loginRegister(){
    console.log(this.login);
    this.registerService.loginUser(this.login).subscribe(data=>{
      console.log(data);
      this.commonUtil.setLoginUser(data);
      this.router.navigate(["/getAllBooks"]);
    });

    //, error=>alert("User is not register")
  }



}
