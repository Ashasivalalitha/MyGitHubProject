package z_javaproj;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetLocalhost {

	public static void main(String[] args) throws UnknownHostException {
	
		
		String myAddress = InetAddress.getLocalHost().getHostAddress();
		String messageBody = "http://"+myAddress+":8080/job/MyFirst/Extent_20Report/";
				
		System.out.println(messageBody);
			

	}

}
