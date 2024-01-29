package com.dxc.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dxc.model.JobPost;
import com.dxc.repository.JobPostRepository;

@SpringBootTest
class JobPostServiceImplTest {

	@Autowired
	private JobPostService jobPostService;
	
	@MockBean
	private JobPostRepository jobPostRepository;
	 
	
	@Test
	public void getallposttest() {
		List<JobPost> job = Arrays.asList(new JobPost(1,"Job Developer","Google","We need a good java developer to work in remote locations","java","angular"));
		when(jobPostRepository.findAll()).thenReturn(job);
		assertEquals(1, jobPostService.getAllJobs().size());
	}
	
	@Test
	public void deleteJobpostbyJIdTest() {
		Long jid = 1L;
		jobPostService.deleteJobPostById(jid);
		verify(jobPostRepository,times(1)).deleteById(jid);
	}
	
	@Test
	public void SaveJobtest() {
		JobPost job = new JobPost();
		job.setJid(1L);
		job.setTitle("Java Developer");
		job.setCompany("TCS");
		job.setDesc("TCS needs a java developer in remote locations");
		job.setTech1("Java");
		job.setTech2("Backend");
		
		when(jobPostRepository.save(job)).thenReturn(job);
		
		JobPost savedJob = jobPostService.saveJob(job);
		
		assertEquals(job, savedJob);
		verify(jobPostRepository,times(1)).save(job);
	}
	
	@Test
	public void findByIdTest() {
		Long jid = 1L;
		
		JobPost jobpost = new JobPost();
		jobpost.setJid(1L);
		jobpost.setTitle("Frontend Developer");
		jobpost.setCompany("DXC");
		jobpost.setDesc("DXC needs a Frontend developer in remote locations");
		jobpost.setTech1("Javascript");
		jobpost.setTech2("Reactjs");
		
		when(jobPostRepository.findById(jid)).thenReturn(Optional.of(jobpost));
		
		JobPost foundJobPost = jobPostService.findById(jid);
		
		assertEquals(jobpost, foundJobPost);
		verify(jobPostRepository,times(1)).findById(jid);
	}
	
	/*@Test
	public void getJobByTechTest(){
		String tech = "Java";
		JobPost job1 = new JobPost();
		job1.setJid(1);
		job1.setTitle("java Developer");
		job1.setCompany("Google");
		job1.setDesc("We need a good java developer to work in remote locations");
		job1.setTech1("Java");
		job1.setTech2("SQL");
		

		Optional<List<JobPost>>  expectedJobPosts = Optional.empty();
		 
		 when(jobPostRepository.findByTech1(tech)).thenReturn(expectedJobPosts);
		 
		 
		 
		 assertThat(expectedJobPosts).isSameAs(expectedJobPosts);
	        verify(jobPostRepository, times(1));
		 
	}*/
	
}
