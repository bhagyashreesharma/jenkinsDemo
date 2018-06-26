package demo;

import java.util.logging.Logger;
/*
 * This is TestClass for jenkins demo
 */
public class JenkinsDemo {

	static Logger logger = Logger.getLogger("JenkinsDemo");
	private static final String NAME = "Bhagyashree";
	
	/**
	 * This method is calling getString() method
	 * and logging string received by method
	 * @param args
	 */
	public static void main(String[] args) {
		String str = getString();
		logger.info(str);
	}
	
	/**
	 * This method returns String constant
	 * @return String NAME
	 */
	public static String getString() {
		return NAME;
	}
	
}
