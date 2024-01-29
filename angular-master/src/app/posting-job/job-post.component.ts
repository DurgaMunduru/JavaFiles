import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { JobPost } from '../JobPost';
import { Router } from '@angular/router';
import { JobPostService } from '../job-post.service';

@Component({
  selector: 'app-job-post',
  templateUrl: './job-post.component.html',
  styleUrls: ['./job-post.component.css']
})
export class JobPostComponent {


  jobpost:JobPost=new JobPost();


  constructor(private jobpostService:JobPostService,
    private router:Router){}


  onClickSubmit(result)
  {
    this.jobpost.title=result.title;
    this.jobpost.company=result.company;
    this.jobpost.desc=result.des;
    this.jobpost.tech1=result.tech1;
    this.jobpost.tech2=result.tech2;
    this.saveEmployee();
  }
  // email=sessionStorage.getItem('emailtoken');
  // role=sessionStorage.getItem('roletoken');

  saveEmployee(){
    this.jobpostService.saveJobPost(this.jobpost).subscribe(data=>{
      console.log(data);
      this.goToJobList();
    },
    error => console.log(error)
    );
  }
  goToJobList(){
    this.router.navigate(['/jobs']);
  }

}
