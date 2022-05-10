package com.test.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/DemoTest")
public class MyController {
	private static final Logger logger = LogManager.getLogger(MyController.class);

	@PostMapping(value = "/test")
	public void FileExecutionStatus() throws Exception {
		logger.error("My exception in DataControlle in ClientContainerr");
		//throw new Exception("My exception in DataController in ClientContainer");

	}
}
