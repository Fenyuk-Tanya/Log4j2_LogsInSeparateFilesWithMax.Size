package com.fenuik;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        for (int i = 0; i < 1000; i++) {
            LOGGER.info("This is log message number: {}", i);
        }
    }
}
