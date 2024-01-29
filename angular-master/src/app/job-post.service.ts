import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { JobPost } from './JobPost';

@Injectable({
  providedIn: 'root'
})
export class JobPostService {

  private baseURL="http://localhost:9999/job-post";
  constructor(private httpClient:HttpClient) { }

  getAllJobPost():Observable<JobPost[]>{
    return this.httpClient.get<JobPost[]>(`${this.baseURL}/all-jobs`);
  }

  saveJobPost(jobpost:JobPost):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}/save-job`,jobpost);
  }

  getJobPostById(jid:number):Observable<JobPost>{
    return this.httpClient.get<JobPost>(`${this.baseURL}/get-job/${jid}`);
  }

  updateJobPost(jid:number,jobpost:JobPost):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/update-job/${jid}`,jobpost);
  }

  deleteJobPost(jid:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/delete-job/${jid}`);
  }
}
