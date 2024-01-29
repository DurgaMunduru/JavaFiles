import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
  
})
export class NavbarComponent implements OnInit {

  constructor(private router:Router){}

  REnabled:boolean=false;
  JEnabled:boolean=false;
  role:any;
  ngOnInit(): void {
    this.role=sessionStorage.getItem('roletoken')
    if(this.role=='JobSeeker')
    {
      this.JEnabled=true;
      this.REnabled=false;
    }
    else
    {
      this.JEnabled=false;
      this.REnabled=true;
    }
  }


  onLogout()
  {
    sessionStorage.removeItem('emailtoken');
    sessionStorage.removeItem('roletoken');
    this.router.navigate(['/login']);
  }

}
