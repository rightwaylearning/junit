package string.opt;

import org.junit.Test;

import junit.framework.Assert;

public class StringOperationTest {

	@Test
	public void testResult() {
		StringOperation obj = new StringOperation();
		String result = obj.getFinalString("Amruta");
		Assert.assertEquals("hello Amruta", result);
	}
	
	@Test
	public void testforNullResult() {
		StringOperation obj = new StringOperation();
		String result = obj.getFinalString(null);
		Assert.assertEquals(null, result);
	}

}
