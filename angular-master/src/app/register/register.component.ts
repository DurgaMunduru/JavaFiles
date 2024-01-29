import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  myUsername="";
  myEmail="";
  myPassword="";
  myRole="";
  msg:string='';
  user:User=new User();
  storeValues(username,email,password,role)
  {
    this.user.username=username;
    this.user.email=email;
    this.user.password=password;
    this.user.role=role;
    this.msg='';
    this.saveEmployee();
  }

  
  constructor(private userService:UserService,
    private router:Router){}

    saveEmployee(){
      this.userService.registerUser(this.user).subscribe(data=>{
        console.log(data);
        this.msg='Successful registration';
        this.goToCreateProfile();
      },
      error => {
        this.msg='This user already exists';
        console.log(error);}
      );
    }
  gotoLogin() {
    this.router.navigate(['/login'])

  }
  goToCreateProfile()
  {
    this.router.navigate(['/create-profile'])
  }

}
