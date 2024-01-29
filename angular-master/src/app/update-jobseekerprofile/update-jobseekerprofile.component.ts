import { Component, OnInit } from '@angular/core';
import { JobseekerProfile } from '../jobseeker-profile';
import { JobseekerProfileService } from '../jobseeker-profile.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update-jobseekerprofile',
  templateUrl: './update-jobseekerprofile.component.html',
  styleUrls: ['./update-jobseekerprofile.component.css']
})
export class UpdateJobseekerprofileComponent {

  firstname:string=''
  profile:JobseekerProfile = new JobseekerProfile();

  constructor(private jobSeekerService:JobseekerProfileService,
    private route:ActivatedRoute,
    private router:Router){}



  ngOnInit(): void {
    this.firstname = this.route.snapshot.params['firstname'];

    this.jobSeekerService.getProfileByFirstName(this.firstname).subscribe(data=>{
      this.profile=data;
    },
    error=>console.log(error)
    );
  }

  onSubmit(){
    this.jobSeekerService.updateProfileByfirstname(this.firstname,this.profile).subscribe(data=>{
      this.goToHome();
    },
    error=>console.log(error)
    );
  }

  goToHome(){
    this.router.navigate(['/home']);
  }

}
