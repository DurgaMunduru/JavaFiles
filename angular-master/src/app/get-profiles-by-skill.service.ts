import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { JobseekerProfile } from './jobseeker-profile';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class GetProfilesBySkillService {


  private baseURL="http://localhost:9999/shortlisting"

  constructor(private httpClient:HttpClient) { }


  getCandidatesBySkills(skill1:string):Observable<JobseekerProfile[]>{
    return this.httpClient.get<JobseekerProfile[]>(`${this.baseURL}/candidates/skill-${skill1}`);
  }


  getMessageForCommunication(email: string): Observable<string> {
    const endpoint = `/candidate-${email}/contact`;
    return this.httpClient.get<string>(`${this.baseURL}${endpoint}`);
  }


}

