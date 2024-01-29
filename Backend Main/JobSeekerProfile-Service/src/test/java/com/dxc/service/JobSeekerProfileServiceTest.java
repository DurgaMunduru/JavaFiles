package com.dxc.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dxc.model.JobSearchAndApplyDto;
import com.dxc.model.JobSeekerProfile;
import com.dxc.repository.JobSeekerProfileRepository;

@SpringBootTest
public class JobSeekerProfileServiceTest {
	@Autowired	
	JobSeekerProfileService service;
	
	@MockBean
	JobSeekerProfileRepository repo;
	
	
	
	@Test
	void getUserTest()
	{
		int cid=1;
		JobSeekerProfile j=new JobSeekerProfile();
		j.setCid(cid);
		j.setFirstname("Peter");
		j.setLastname("Parker");
		j.setAge(19);
		j.setEmail("peter.parker@dailybugle.com");
		j.setContactnumber("34582394392");
		j.setLocation("Queens");
		j.setQualification("Engineering");
		j.setSkill1("AI");
		j.setSkill2("Material engineering");
		
		when(repo.findByEmail(j.getEmail())).thenReturn(j);
		JobSeekerProfile expected=service.getUser(j.getEmail());
		assertThat(expected).isSameAs(j);
		verify(repo).findByEmail(j.getEmail());
		
	}
	
	
	@Test
	void getAllJobSeekerProfilesTest()
	{
		when(repo.findAll()).thenReturn(
					Stream.of( new JobSeekerProfile(1,"Ravi","Das",21,"ravi.das@dxc.com","773233223","Kolkata","B.Tech","Java", "Python","1 Year"),
							new JobSeekerProfile(2,"Savi","Fas",21,"savi.fas@dxc.com","755553223","Kota","B.Tech","HTML", "Java","HTML"))
							.collect(Collectors.toList()));
		assertEquals(2,service.getAllJobSeekerProfiles().size());
	}
}
