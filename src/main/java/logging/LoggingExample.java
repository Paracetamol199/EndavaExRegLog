package logging;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoggingExample {
    private static final Logger logger = LogManager.getLogger(LoggingExample.class);

    public static void main(String... args) {
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
    }
}
