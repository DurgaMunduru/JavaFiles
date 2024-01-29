import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllJobPostsComponent } from './all-job-posts.component';

describe('AllJobPostsComponent', () => {
  let component: AllJobPostsComponent;
  let fixture: ComponentFixture<AllJobPostsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AllJobPostsComponent]
    });
    fixture = TestBed.createComponent(AllJobPostsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
