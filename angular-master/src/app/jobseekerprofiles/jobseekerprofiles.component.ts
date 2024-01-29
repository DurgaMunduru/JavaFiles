import { Component, OnInit } from '@angular/core';
import { JobseekerProfile } from '../jobseeker-profile';
import { JobseekerProfileService } from '../jobseeker-profile.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-jobseekerprofiles',
  templateUrl: './jobseekerprofiles.component.html',
  styleUrls: ['./jobseekerprofiles.component.css']
})
export class JobseekerprofilesComponent implements OnInit {
  jobseekerprofiles:any;

  constructor(private jobSeekerService:JobseekerProfileService,
    private router:Router){}


ngOnInit():void{
  this.getAllProfiles();
}

private getAllProfiles(){
  this.jobSeekerService.getAllProfiles().subscribe(data=>
    {
      this.jobseekerprofiles=data;
    }
    );
}

updateJobseekerProfile(firstname:string){
  this.router.navigate(['update-jobseekerprofile',firstname]);
}

jobseekerdetails(firstname:string){
  this.router.navigate(['jobseeker-details']);
}


}
