package com.perficient.techbootcamprachel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechbootcampRachelApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(TechbootcampRachelApplicationTests.class);

	@Test
	void contextLoads() {
		logger.debug("DEBUG");
		logger.trace("TRACE");
		logger.info("INFO");
		logger.warn("WARN");
		logger.error("ERROR");
		
		String foo = "foo";
		logger.debug("foo is " + foo); // do not do string concat (expensive operation)
		logger.debug("foo is {}", foo);
	}

}
