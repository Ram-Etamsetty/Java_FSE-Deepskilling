package com.example.Ex1_logging_error_messages;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class SampleLogging {
	private static final Logger logger = LoggerFactory.getLogger(SampleLogging.class); 
	
	public static void main(String []args) {
		logger.info("This is a info message");
		logger.error("This is an error message");
		logger.warn("This is  a warning");
	}
}
