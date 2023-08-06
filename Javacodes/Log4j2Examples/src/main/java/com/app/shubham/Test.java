package com.app.shubham;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Test {
	
	private static final Logger Log= LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
			processData();
	}
	
	public static void processData()
	{
		Log.trace(" from trace method");
		Log.debug("from debug method");
		Log.info("from info method");
		Log.warn("from warn method");
		Log.error("from error method");
		Log.fatal("from fatal method");
		
		//..read inputs
		//..validate them
		//..store in db
		//..return results
		
	}
}
