import { Injectable } from '@angular/core';
import { HttpClient } from  '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './User';
import { UserCredential } from './UserCredential';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseURL="http://localhost:9900/fit-my-job"
  constructor(private http: HttpClient) { }

  registerUser(user:User):Observable<Object>{
    return this.http.post(`${this.baseURL}/register`,user);
  }

  loginUser(usercred:UserCredential):Observable<Object>
  {
    return this.http.post(`${this.baseURL}/login`,usercred);
  }
}
