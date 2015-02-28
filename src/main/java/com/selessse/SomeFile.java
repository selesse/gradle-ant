package com.selessse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeFile {
    private static final Logger LOGGER = LoggerFactory.getLogger(SomeFile.class);

    @Override
    public String toString() {
        LOGGER.info("Printing toString");
        return getClass().getSimpleName();
    }
}
