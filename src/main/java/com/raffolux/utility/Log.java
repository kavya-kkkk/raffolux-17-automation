/**
 * 
 */
package com.raffolux.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import java.util.logging.Logger;

/**
 * @author hp
 *
 */
public class Log 
{
	//initialize log4j logs
	private static Logger log = LogManager.getLogger(Log.class.getName());
	
	
	public static void startTestcase(String TestCaseName)
	{
		log.info("=================================="+TestCaseName+" TEST STARTED =======================================");
	}
     
	public static void endTestcase(String TestCaseName)
	{
		log.info("=================================="+TestCaseName+" TEST ENDED =======================================");
	}
	
	public static void failTestcase(String TestCaseName)
	{
		log.info("=================================="+TestCaseName+" TEST FAILED =======================================");
	}
	
	public static void skippedTestcase(String TestCaseName)
	{
		log.info("=================================="+TestCaseName+" TEST SKIPPED=======================================");
	}
	
	
	//Need to create below mentioned methods, so that they can be called
	
	public static void info(String message)
	{
		log.info(message);
	}
	
	public static void warn(String message)
	{
		log.warn(message);
	}
	
	public static void error(String message)
	{
		log.error(message);
	}
	
	public static void fatal(String message)
	{
		log.fatal(message);
	}
	
	public static void debug(String message)
	{
		log.debug(message);
	}
	
	

}
