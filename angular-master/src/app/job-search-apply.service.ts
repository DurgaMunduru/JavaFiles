import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { JobPost } from './JobPost';
import { JobSearchAndApply } from './JobSearchAndApply';

@Injectable({
  providedIn: 'root'
})
export class JobSearchApplyService {

  private baseURL="http://localhost:9999/job-search";
  constructor(private httpClient:HttpClient) { }

  getDesiredJobs(tech:string):Observable<JobPost[]>
  {
    return this.httpClient.get<JobPost[]>(`${this.baseURL}/${tech}`);
  }

  applyJob(cid:number,jid:number,jsa:JobSearchAndApply):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}/save-job/cid-${cid}_jid-${jid}`,jsa);
  }

  getAppliedJobsDetails(cid:number):Observable<JobPost[]>{
    return this.httpClient.get<JobPost[]>(`${this.baseURL}/applied-jobs-details/${cid}`);
  }
}
