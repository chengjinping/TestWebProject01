package com.cjp.maven;

import org.apache.log4j.Logger;
import org.junit.Test;



public class TestLog {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestLog.class);
	@Test
	public void animal(){
		TestProject01 ss=new TestProject01();
		Mycat cat=new Mycat();
		cat.eat();
		
	}
	
}
