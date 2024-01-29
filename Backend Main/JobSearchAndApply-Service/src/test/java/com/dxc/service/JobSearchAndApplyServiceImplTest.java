package com.dxc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dxc.model.JobSearchAndApply;
import com.dxc.repository.JobSearchAndApplyRepository;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class JobSearchAndApplyServiceImplTest {

	@Autowired
	JobSearchAndApplyService jss;
	
	@MockBean
	JobSearchAndApplyRepository repo;
	
	
	/*public List<JobSearchAndApply> getJidByCid(int cid) {
		return repo.findByCid(cid);
	}*/
	
	
	@Test
	void getJidByCidTest() {
	
		when(repo.findByCid(1)).thenReturn(Stream.of(new JobSearchAndApply(1,234, 1)).collect(Collectors.toList()) );
		assertEquals(1, jss.getJidByCid(1).size());
	}
	
	
		
	
}