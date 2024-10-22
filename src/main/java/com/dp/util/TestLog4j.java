package com.dp.util;

import org.apache.log4j.Logger;

public class TestLog4j {
	private static final Logger logger = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {

		for (int i = 0; i < 10000; i++) {

			logger.debug("test debug");
			logger.info("test info");
			logger.warn("test warn");
			logger.error("test error");
			logger.fatal("test fatal");
			
		}
	}
}
