package demo;

import org.junit.Assert;
import org.junit.Test;

import demo.TestClass;

public class JunitTestClass {

@Test
public void test() {
	Assert.assertEquals("Bhagyashree", TestClass.getString());
}
}
