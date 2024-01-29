import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplyJobIdsComponent } from './apply-job-ids.component';

describe('ApplyJobIdsComponent', () => {
  let component: ApplyJobIdsComponent;
  let fixture: ComponentFixture<ApplyJobIdsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ApplyJobIdsComponent]
    });
    fixture = TestBed.createComponent(ApplyJobIdsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
