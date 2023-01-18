import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "./user";
import {Observable} from "rxjs";
import {Login} from "./login";

@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  baseUrl="http://localhost:8080/api/v1/";
  constructor(private httpClient: HttpClient) { }

  registerUser(user: User): Observable<any>{
        console.log(user);
        const responseOptions : Object = {
          responseType: "text"
        }
        return this.httpClient.post<any>(`${this.baseUrl}registration`, user, responseOptions);
  }

  loginUser(login: Login): Observable<any>{
    console.log(login);
    return this.httpClient.post<any>(`${this.baseUrl}login`, login);
  }



}
