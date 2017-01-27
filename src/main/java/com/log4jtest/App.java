package com.log4jtest;

import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = Logger.getLogger(App.class);
    public static void main(String[] args) {
        log.trace("trace message");
        log.debug("debug message");
        log.info("info message");
        log.warn("warn message");
        log.error("error message");
        log.fatal("fatal message");
    }
}
