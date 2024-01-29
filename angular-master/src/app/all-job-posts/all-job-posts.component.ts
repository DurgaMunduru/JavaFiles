import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JobPost } from '../JobPost';
import { JobPostService } from '../job-post.service';

@Component({
  selector: 'app-all-job-posts',
  templateUrl: './all-job-posts.component.html',
  styleUrls: ['./all-job-posts.component.css']
})
export class AllJobPostsComponent implements OnInit {
  
    jobposts:any;
    
    constructor(private jobpostService:JobPostService,
      private router:Router){}
  
  ngOnInit(): void {
    this.getJobposts();
  }
  
  private getJobposts(){
    this.jobpostService.getAllJobPost().subscribe(data=>
      {
        this.jobposts=data;
      });
  }
  // employeeDetails(jid:number){
  //   this.router.navigate(['employee-details',jid]);
  // }
  
  updateJobpost(jid:number){
    this.router.navigate(['update-job',jid]);
  }
  
  deleteJobpost(jid:number){
   this.jobpostService.deleteJobPost(jid).subscribe(data=>{
      console.log(data);
      this.getJobposts();
   });
  }

  createJob(){
    this.router.navigate(['/save-job-post']);
    
  }
}
