import { Component,OnInit } from '@angular/core';
import { JobseekerProfile } from '../jobseeker-profile';
import { JobseekerProfileService } from '../jobseeker-profile.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-jobseeker-details',
  templateUrl: './jobseeker-details.component.html',
  styleUrls: ['./jobseeker-details.component.css']
})
export class JobseekerDetailsComponent implements OnInit{


  email:any='';
  profile:any;

  constructor(private jobSeekerService:JobseekerProfileService,
    private route:ActivatedRoute, private router:Router){}


ngOnInit(): void {
  this.email=sessionStorage.getItem('emailtoken');
  this.profile=new JobseekerProfile();
  this.jobSeekerService.getUserByEmail(this.email).subscribe(data=>{
    this.profile=data;
  });
}

updateJobseekerProfile(firstname:string){
  this.router.navigate(['update-jobseekerprofile',firstname]);
}

}
