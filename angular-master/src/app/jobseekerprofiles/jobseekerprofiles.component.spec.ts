import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobseekerprofilesComponent } from './jobseekerprofiles.component';

describe('JobseekerprofilesComponent', () => {
  let component: JobseekerprofilesComponent;
  let fixture: ComponentFixture<JobseekerprofilesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [JobseekerprofilesComponent]
    });
    fixture = TestBed.createComponent(JobseekerprofilesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
