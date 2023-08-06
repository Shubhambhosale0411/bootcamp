package com.telstra;

import org.slf4j.*;
import org.slf4j.LoggerFactory;

public class EmployeeService {
	
	private static final Logger logger=(Logger) LoggerFactory.getLogger(EmployeeService.class);
	
	void addEmployee()
	{
		logger.error("this is error");
		logger.warn("this is warn");
		
	}
}
