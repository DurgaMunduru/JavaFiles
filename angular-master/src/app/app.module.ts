import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { UpdateJobComponent } from './update-job/update-job.component';
import { HeaderComponent } from './header/header.component';
import { NavbarComponent } from './navbar/navbar.component';
import { Route, RouterModule, Routes } from '@angular/router';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import { AboutComponent } from './about/about.component';
import { UpdateProfileComponent } from './update-profile/update-profile.component';
import { JobPostComponent } from './posting-job/job-post.component';

import { HttpClientModule } from  '@angular/common/http';
import { AllJobPostsComponent } from './all-job-posts/all-job-posts.component';
import { DesiredJobListComponent } from './desired-job-list/desired-job-list.component';
import { ApplyJobIdsComponent } from './apply-job-ids/apply-job-ids.component';
import { JobsAppliedComponent } from './jobs-applied/jobs-applied.component';
import { CreateJobseekerprofileComponent } from './create-jobseekerprofile/create-jobseekerprofile.component';
import { UpdateJobseekerprofileComponent } from './update-jobseekerprofile/update-jobseekerprofile.component';
import { JobseekerprofilesComponent } from './jobseekerprofiles/jobseekerprofiles.component';
import { JobseekerDetailsComponent } from './jobseeker-details/jobseeker-details.component';
import { GetProfilesBySkillComponent } from './get-profiles-by-skill/get-profiles-by-skill.component';
import { CommunicationComponent } from './communication/communication.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    UpdateJobComponent,
    
    HeaderComponent,
    NavbarComponent,
    JobPostComponent,
    AboutComponent,
    UpdateProfileComponent,
    AllJobPostsComponent,
    DesiredJobListComponent,
    ApplyJobIdsComponent,
    JobsAppliedComponent,
    CreateJobseekerprofileComponent,
    UpdateJobseekerprofileComponent,
    JobseekerprofilesComponent,
    JobseekerDetailsComponent,
    GetProfilesBySkillComponent,
    CommunicationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    MatToolbarModule,
    MatButtonModule,
    MatMenuModule,
    ReactiveFormsModule,
    HttpClientModule

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
