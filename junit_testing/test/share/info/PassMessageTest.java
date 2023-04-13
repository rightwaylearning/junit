package share.info;

import org.junit.Assert;
import org.junit.Test;

public class PassMessageTest {

	@Test
	public void validateGetMessageOutput() {
		PassMessage m = new PassMessage();
		String result = m.getMessage("mahesh");
		Assert.assertEquals("hello mahesh", result);
	}
	
	@Test
	public void validateNegativeGetMessageOutput() {
		PassMessage m = new PassMessage();
		String result = m.getMessage("mahesh");
		Assert.assertNotEquals("hello   mahesh", result);
	}
	
	@Test
	public void checkNotNullResult() {
		PassMessage m = new PassMessage();
		String result = m.getMessage(null);
		Assert.assertNull(result);
	}
	
	
}
 