import { TestBed } from '@angular/core/testing';

import { GetProfilesBySkillService } from './get-profiles-by-skill.service';

describe('GetProfilesBySkillService', () => {
  let service: GetProfilesBySkillService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetProfilesBySkillService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
