package demo;

import java.util.logging.Logger;

public class TestClass {

	static Logger logger = Logger.getLogger("TestClass");
	private static final String name = "Bhagyashree";
	public static void main(String[] args) {
		String str = getString();
		logger.info("String response : "+str);
	}
	
	public static String getString() {
		return name;
	}
	
}
