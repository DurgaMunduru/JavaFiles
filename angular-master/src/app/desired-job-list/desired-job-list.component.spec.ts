import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DesiredJobListComponent } from './desired-job-list.component';

describe('DesiredJobListComponent', () => {
  let component: DesiredJobListComponent;
  let fixture: ComponentFixture<DesiredJobListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DesiredJobListComponent]
    });
    fixture = TestBed.createComponent(DesiredJobListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
