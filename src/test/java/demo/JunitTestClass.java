package demo;

import org.junit.Assert;
import org.junit.Test;

import demo.TestClass;

/**
 * This is Junit Test class for TestClass
 * @author bsharma
 *
 */
public class JunitTestClass {

/**
 * This is Test method for getString class
 */
@Test
public void test() {
	Assert.assertEquals("Bhagyashree", TestClass.getString());
}
}
