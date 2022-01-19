package com.jenkinsapp.jenkinscicd;

import com.jenkinsapp.jenkinscicd.controller.SmsController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsCiCdApplicationTests {

	@Autowired
	private SmsController controller;


	@DisplayName("Object Present or Not")
	@Test
	void contextLoads() {

		Assertions.assertNotNull(controller);
	}

}
