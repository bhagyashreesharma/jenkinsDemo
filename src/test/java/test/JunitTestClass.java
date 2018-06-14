package test;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestClass {

@Test
public void test() {
	Assert.assertEquals("Bhagyashree", TestClass.getString());
}
}
