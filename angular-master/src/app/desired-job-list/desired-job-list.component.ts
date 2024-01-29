import { Component } from '@angular/core';
import { JobPostService } from '../job-post.service';
import { ActivatedRoute, Router } from '@angular/router';
import { JobSearchApplyService } from '../job-search-apply.service';
import { JobSearchAndApply } from '../JobSearchAndApply';

@Component({
  selector: 'app-desired-job-list',
  templateUrl: './desired-job-list.component.html',
  styleUrls: ['./desired-job-list.component.css']
})
export class DesiredJobListComponent {

  jobposts:any;
  public cid_string:any;
  public cid:number=0;
  public skill:string='';
    constructor(private jobsearchService:JobSearchApplyService,
      private router:Router,private route:ActivatedRoute){}
  
      jsa:JobSearchAndApply=new JobSearchAndApply();

  ngOnInit(): void {
    // this.skill=this.route.snapshot.params['search'];
    this.getDesiredJobposts(this.skill);
  }

  getDesiredJobposts(skill){
    this.jobsearchService.getDesiredJobs(this.skill).subscribe(data=>
      {
        this.jobposts=data;
      });

  }
  onClickSubmit(searchTech)
  {
    this.skill=searchTech.search;
    this.ngOnInit();
  }


  applyJobpost(jid:number){
    this.cid_string=sessionStorage.getItem('idtoken');
    this.cid=Number(this.cid_string);
    this.jsa.cid=this.cid;
    this.jsa.jid=jid;
    this.jobsearchService.applyJob(this.cid,jid,this.jsa).subscribe(data=>{
       console.log(data);
    });
   }

}
