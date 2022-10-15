package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggerTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.trace("log1-trace-log");
        logger.debug("log2-debug-log");
        logger.info("log3-info-log");
        logger.warn("log4-ware-log");
        logger.error("log5-error-log");
    }
}
