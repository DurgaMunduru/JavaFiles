import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateJobseekerprofileComponent } from './create-jobseekerprofile.component';

describe('CreateJobseekerprofileComponent', () => {
  let component: CreateJobseekerprofileComponent;
  let fixture: ComponentFixture<CreateJobseekerprofileComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateJobseekerprofileComponent]
    });
    fixture = TestBed.createComponent(CreateJobseekerprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
