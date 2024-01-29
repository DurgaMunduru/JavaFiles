import { Component,OnInit } from '@angular/core';
import { JobseekerProfile } from '../jobseeker-profile';
import { JobseekerProfileService } from '../jobseeker-profile.service';
import { GetProfilesBySkillService } from '../get-profiles-by-skill.service';
import { ActivatedRoute,Router } from '@angular/router';

@Component({
  selector: 'app-get-profiles-by-skill',
  templateUrl: './get-profiles-by-skill.component.html',
  styleUrls: ['./get-profiles-by-skill.component.css']
})
export class GetProfilesBySkillComponent implements OnInit {


  profiles:any;
  public skill1:string='';
  public email:string='';

  constructor(private getprofilebyskillservice:GetProfilesBySkillService,
    private router:Router,private route:ActivatedRoute){}


    ngOnInit():void{
      this.getprofilesbyskill1(this.skill1);
    }

    getprofilesbyskill1(skill1:string){
      this.getprofilebyskillservice.getCandidatesBySkills(this.skill1).subscribe(data=>
        {
          this.profiles=data;
        });
    }

    onClickSubmit(searchSkill:any){
      this.skill1=searchSkill.search;
      this.ngOnInit();
    }

    getEmail(email:string){
      this.router.navigate(['/communication',email]);
    }

}
