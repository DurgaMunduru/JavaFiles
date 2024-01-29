import { Component, OnInit } from '@angular/core';
import { JobseekerProfile } from '../jobseeker-profile';

import { GetProfilesBySkillService } from '../get-profiles-by-skill.service';
import { ActivatedRoute, Router } from '@angular/router';
import { JobseekerProfileService } from '../jobseeker-profile.service'; 

@Component({
  selector: 'app-communication',
  templateUrl: './communication.component.html',
  styleUrls: ['./communication.component.css']
})
export class CommunicationComponent implements OnInit {

  email:string='';
  profile:any='';


  constructor(private getprofilebyskillservice:GetProfilesBySkillService,
    private jobseekerprofileservice:JobseekerProfileService,
    private router:Router,private route:ActivatedRoute){}
    



ngOnInit(): void {
  
this.email=this.route.snapshot.params['email'];

this.jobseekerprofileservice.getUserByEmail(this.email).subscribe(data=>{
  this.profile=data;
  console.log(data);
},
error=>console.log(error)
);

}

}
