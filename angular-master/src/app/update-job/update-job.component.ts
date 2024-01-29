import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { JobPost } from '../JobPost';
import { JobPostService } from '../job-post.service';

@Component({
  selector: 'app-update-job',
  templateUrl: './update-job.component.html',
  styleUrls: ['./update-job.component.css']
})
export class UpdateJobComponent implements OnInit{
  
  jid:number=0;
  jobpost:JobPost = new JobPost();

  constructor(private jobpostservice:JobPostService,
    private route:ActivatedRoute,
    private router:Router){}
  
  ngOnInit(): void {
    this.jid = this.route.snapshot.params['jid'];

    this.jobpostservice.getJobPostById(this.jid).subscribe(data=>{
      this.jobpost = data;
    },
    error => console.log(error)
    );
  }
    onClickSubmit(){
      this.jobpostservice.updateJobPost(this.jid,this.jobpost).subscribe(data=>{
        this.goToJobList();
      },
      error => console.log(error)
      );
    }
  
    goToJobList(){
      this.router.navigate(['/jobs']);
    }
  }
// Java Guides SpringBoot+Angular video watch
