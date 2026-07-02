package com.example.parameterized_logging;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
	
	private static int id = 30;
	private static String name = "Ram";
	private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);
	public static void main(String args[]) {
		logger.error("This is parametrized logging Id: {}, Name: {}",id,name);
	}
}
