import { TestBed } from '@angular/core/testing';

import { JobSearchApplyService } from './job-search-apply.service';

describe('JobSearchApplyService', () => {
  let service: JobSearchApplyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JobSearchApplyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
