import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';

import { JobPostComponent } from './posting-job/job-post.component';
import { UpdateJobComponent } from './update-job/update-job.component';

import { HeaderComponent } from './header/header.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AboutComponent } from './about/about.component';

import { AllJobPostsComponent } from './all-job-posts/all-job-posts.component';
import { DesiredJobListComponent } from './desired-job-list/desired-job-list.component';
import { JobsAppliedComponent } from './jobs-applied/jobs-applied.component';
import { CreateJobseekerprofileComponent } from './create-jobseekerprofile/create-jobseekerprofile.component';
import { UpdateJobseekerprofileComponent } from './update-jobseekerprofile/update-jobseekerprofile.component';
import { JobseekerprofilesComponent } from './jobseekerprofiles/jobseekerprofiles.component';
import { JobseekerDetailsComponent } from './jobseeker-details/jobseeker-details.component';
import { GetProfilesBySkillComponent } from './get-profiles-by-skill/get-profiles-by-skill.component';
import { CommunicationComponent } from './communication/communication.component';

const routes: Routes = [

  {path: 'login', component:LoginComponent},
  {path:'', redirectTo:'login',pathMatch:'full'},
  {path: 'home', component:HomeComponent},
  {path: 'register', component:RegisterComponent},
  {path: 'about', component:AboutComponent},
  {path:'create-profile', component:CreateJobseekerprofileComponent},
  {path: 'save-job-post', component:JobPostComponent},
  {path: 'jobs', component:AllJobPostsComponent},
  {path: 'update-job/:jid', component: UpdateJobComponent},
  {path: 'search-job', component:DesiredJobListComponent},
  {path: 'applied-jobs', component:JobsAppliedComponent},
  {path:'update-jobseekerprofile/:firstname', component:UpdateJobseekerprofileComponent},
  {path:'jobseekerprofiles', component:JobseekerprofilesComponent},
  {path:'jobseeker-details', component:JobseekerDetailsComponent},
  {path:'getprofile', component:GetProfilesBySkillComponent},
  {path:'communication/:email', component:CommunicationComponent}
  
  
  
  
 
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
