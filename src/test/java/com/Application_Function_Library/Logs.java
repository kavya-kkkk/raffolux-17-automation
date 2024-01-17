

package com.Application_Function_Library;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author hp
 *
 */

public class Logs 
{
	    private static final Logger logger = LogManager.getLogger(Logs.class);

	    public static void logInfo(String message) {
	        logger.info(message);
	    }

	    public static void logError(String message) {
	        logger.error(message);
	    }

	    public static void logWarning(String message) {
	        logger.warn(message);
	    }
}

