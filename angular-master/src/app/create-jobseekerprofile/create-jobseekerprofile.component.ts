import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { JobseekerProfile } from '../jobseeker-profile';
import { JobseekerProfileService } from '../jobseeker-profile.service';

@Component({
  selector: 'app-create-jobseekerprofile',
  templateUrl: './create-jobseekerprofile.component.html',
  styleUrls: ['./create-jobseekerprofile.component.css']
})
export class CreateJobseekerprofileComponent {

  profile:JobseekerProfile = new JobseekerProfile();

  constructor(private jobseekerprofileservice:JobseekerProfileService,
     private router:Router){}


  ngOnInit(): void {
    
  }

  saveProfile(){
    this.jobseekerprofileservice.createJobSeekerProfile(this.profile).subscribe(data=>{
      console.log(data);
      this.gotoLogin();
    },
    error=>console.log(error)
    );
  }
    

  goToJobseekerProfiles(){
    this.router.navigate(['/jobseekerprofiles'])
  }


  onSubmit(){
    console.log(this.profile);
    this.saveProfile();
  }

  gotoLogin() {
    this.router.navigate(['/login'])

  }


}
