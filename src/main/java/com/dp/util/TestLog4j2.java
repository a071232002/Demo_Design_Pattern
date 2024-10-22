package com.dp.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j2 {
	private static final Logger logger = LogManager.getLogger(TestLog4j2.class);

	public static void main(String[] args) {

		for (int i = 0; i < 100000; i++) {
			logger.debug("test debug");
			logger.info("test info");
			logger.warn("test warn");
			logger.error("test error");
			logger.fatal("test fatal");
		}
	}
}
