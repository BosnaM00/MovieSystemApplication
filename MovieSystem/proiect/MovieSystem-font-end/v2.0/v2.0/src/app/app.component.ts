import {Component, OnDestroy} from '@angular/core';
import {CommonUtil} from "./services/commonUtil";
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnDestroy{
  title = 'visionLibraryFE';

  constructor(public commonUtil: CommonUtil,private router: Router) {
  }

  logout(event: any) {
    this.commonUtil.logout();
    this.commonUtil.setLoginUser(null);
    this.router.navigate(["/home"]);
  }

  ngOnDestroy() {
    //this.commonUtil.logout();
    //this.commonUtil.setLoginUser(null);
  }
}

