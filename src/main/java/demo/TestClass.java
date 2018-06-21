package demo;

import java.util.logging.Logger;
/*
 * This is TestClass for jenkins demo
 */
public class TestClass {

	static Logger logger = Logger.getLogger("TestClass");
	private static final String NAME = "Bhagyashree";
	
	/**
	 * This method is logging string
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
