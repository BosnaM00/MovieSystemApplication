import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})

export class CommonUtil {
  private loginUser: any = null;

  constructor() {
    console.log("here");
    if(localStorage.getItem("visionLibraryLogin")) {
      let user: any = localStorage.getItem("visionLibraryLogin");
      user  = JSON.parse(user);
      if(user) {
        this.loginUser = user;
      }
    }
  }

  public setLoginUser(loginUser: any) {
    localStorage.setItem("visionLibraryLogin",JSON.stringify(loginUser));
    this.loginUser = loginUser;
    //this.loginUser.appUserRole = "ADMIN";
  }

  public getLoginUser(): any {
    return this.loginUser;
  }

  public isAdminUser(): boolean {
    if(this.loginUser && this.loginUser.appUserRole === "ADMIN") {
      return true;
    }
    return false;
  }

  public logout() {
    localStorage.removeItem("visionLibraryLogin");
  }
}
