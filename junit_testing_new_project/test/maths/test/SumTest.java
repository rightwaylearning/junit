package maths.test;

import org.junit.Assert;
import org.junit.Test;

import maths.Sum;

public class SumTest {

	@Test
	public void checkResult() {
		Sum s= new Sum();
		Integer r = s.doSum(10, 20);
		Integer a =30;
		Assert.assertEquals(a, r);
	}
	
	@Test
	public void checkResultForNull() {
		Sum s = new Sum();
		Integer r = s.doSum(10, 30);
		Assert.assertEquals(null, r);
	}
	

}
