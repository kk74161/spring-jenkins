package com.spring.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Tesstcase Executing....");
	assertEquals(true, true);
	}

}
