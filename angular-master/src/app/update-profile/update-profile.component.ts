import { Component } from '@angular/core';

@Component({
  selector: 'app-update-profile',
  templateUrl: './update-profile.component.html',
  styleUrls: ['./update-profile.component.css']
})
export class UpdateProfileComponent {

  onClickUpdate(result)
  {
    console.log(result.firstname);
    console.log(result.lastname);
    console.log(result.age);
    console.log(result.contactnumber);
    console.log(result.qualification);
    console.log(result.skill1);
    console.log(result.skill2);
    console.log(result.experience);
  }

}
