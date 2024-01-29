import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetProfilesBySkillComponent } from './get-profiles-by-skill.component';

describe('GetProfilesBySkillComponent', () => {
  let component: GetProfilesBySkillComponent;
  let fixture: ComponentFixture<GetProfilesBySkillComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetProfilesBySkillComponent]
    });
    fixture = TestBed.createComponent(GetProfilesBySkillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
