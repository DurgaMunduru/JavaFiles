import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { JobPost } from '../JobPost';
import { JobSearchApplyService } from '../job-search-apply.service';

@Component({
  selector: 'app-jobs-applied',
  templateUrl: './jobs-applied.component.html',
  styleUrls: ['./jobs-applied.component.css']
})
export class JobsAppliedComponent implements OnInit{

  constructor(private jsa:JobSearchApplyService,
    private route:ActivatedRoute,
    private router:Router){}
  
  public cid_string:any;
  public cid:number=0;
  appliedjobs:any;


  ngOnInit(): void {
    this.cid_string=sessionStorage.getItem('idtoken');
    this.cid=Number(this.cid_string);
    this.jsa.getAppliedJobsDetails(this.cid).subscribe(data=>{
      this.appliedjobs = data;
    },
    error => console.log(error)
    );
  }

  onClick()
  {
    this.router.navigate(['/home']);
  }

}
