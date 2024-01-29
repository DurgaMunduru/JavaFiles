import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';
import { UserCredential } from '../UserCredential';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  myEmail="";
  myPassword="";
  myRole="";
  msg:string='';
  userId:number=0;
  obj:any;
  jsonfile:any;
  usercred:UserCredential=new UserCredential();
  theValues(email,password,role)
  {
    this.usercred.email=email;
    this.usercred.password=password;
    this.usercred.role=role;
    this.msg='';
    this.checkUser();
  }



  constructor(private userService:UserService,
    private router:Router){}

  checkUser() {
    this.userService.loginUser(this.usercred).subscribe(data=>{
      console.log(data);
      this.msg="Successful";
      sessionStorage.setItem('userData',JSON.stringify(data));
      this.obj=sessionStorage.getItem('userData');
      this.jsonfile=JSON.parse(this.obj);
      sessionStorage.setItem('idtoken',this.jsonfile.userId);
      sessionStorage.setItem('emailtoken',this.usercred.email);
      sessionStorage.setItem('roletoken',this.usercred.role);
      console.log(sessionStorage.getItem('emailtoken'));
      console.log(sessionStorage.getItem('roletoken'));
      console.log(sessionStorage.getItem('idtoken'));
      this.goToHomePage();
    },
    error => {
      this.msg='Incorrect email/password/role';
      console.log(error);}
    );
  }
  goToHomePage() {
    this.router.navigate(['/home'])
  }
}
