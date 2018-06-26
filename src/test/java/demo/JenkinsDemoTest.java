package demo;

import org.junit.Assert;
import org.junit.Test;

import demo.JenkinsDemo;

/**
 * This is Junit Test class for TestClass
 * @author bsharma
 *
 */
public class JenkinsDemoTest {

/**
 * This is Test method for getString class
 */
@Test
public void test() {
	Assert.assertEquals("Bhagyashree Sharma", JenkinsDemo.getString());
}
}
