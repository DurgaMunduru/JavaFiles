package com.dxc.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dxc.model.JobSearchAndApply;
import com.dxc.model.JobPostDto;
import com.dxc.repository.JobSearchAndApplyRepository;
@Service
public class JobSearchAndApplyServiceImpl implements JobSearchAndApplyService {

	@Autowired
	private RestTemplate template; 
	
	@Autowired
	private JobSearchAndApplyRepository repo;
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<JobPostDto> searchJobs(String tech) {
		String url="http://localhost:9991/job-post/job-tech/"+tech;
		return template.getForObject(url, List.class) ;
	}

	@Override
	public JobSearchAndApply saveJobApply(int jid, int cid) {
		// TODO Auto-generated method stub
		JobSearchAndApply j=new JobSearchAndApply();
		j.setJid(jid);
		j.setCid(cid);
		return repo.save(j);
	}

	
	public List<JobSearchAndApply> getJidByCid(long cid) {
		return repo.findByCid(cid);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////
	
@Override
public List<JobPostDto> getAppliedJobDetails(int cid) {
// TODO Auto-generated method stub
List<JobSearchAndApply> jobseeker=repo.findByCid(cid);
List<JobPostDto> appliedJobs=new ArrayList<>();
jobseeker.forEach(jobs -> {
int jid=jobs.getJid(); 
String url2="http://localhost:9991/job-post/get-job/"+jid; 
JobPostDto jobPost=template.getForObject(url2, JobPostDto.class); 
appliedJobs.add(jobPost);
});
return appliedJobs;
}
	
	
	
}
