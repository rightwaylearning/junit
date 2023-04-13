package share.info;

public class PassMessage {

	public String getMessage(String msg) {
		
		if(msg == null) {
			return null;
		}
		
		String finalMsg =  "hello " + msg;
		return finalMsg;
	}
}
