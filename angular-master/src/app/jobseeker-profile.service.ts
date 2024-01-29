import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { JobseekerProfile } from './jobseeker-profile';

@Injectable({
  providedIn: 'root'
})
export class JobseekerProfileService {

  private baseURL = "http://localhost:9999/jobseekerprofile";

  //it will create httpclient object and gives object
  constructor(private httpClient:HttpClient) { }


  createJobSeekerProfile(profile:JobseekerProfile):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/addprofile`,profile);

  }

  getProfileBySkill(skill1:string):Observable<JobseekerProfile>{
    return this.httpClient.get<JobseekerProfile>(`${this.baseURL}/${skill1}`);
  }

  updateProfileByfirstname(firstname:string,profile:JobseekerProfile):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/updateprofile/${firstname}`,profile);
  }

  /*getUserAppiledJobs(email:string):Observable<JobseekerProfile>{
    return this.httpClient.get<JobseekerProfile>(`${this.baseURL}/${email}`);
  }*/

  getUserByEmail(email:string):Observable<JobseekerProfile>{
    return this.httpClient.get<JobseekerProfile>(`${this.baseURL}/user/${email}`);
  }

  getAllProfiles():Observable<JobseekerProfile[]>{
    return this.httpClient.get<JobseekerProfile[]>(`${this.baseURL}/showallprofiles`);
  }

  getProfileByFirstName(firstname:string):Observable<JobseekerProfile>{
    return this.httpClient.get<JobseekerProfile>(`${this.baseURL}/profile/${firstname}`);
  }

}
