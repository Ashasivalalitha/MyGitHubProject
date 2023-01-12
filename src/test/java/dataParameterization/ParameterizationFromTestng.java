package dataParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationFromTestng {

	@Parameters({"browser","env"})
	@Test
	public void go(String browserName,String envName) {

		System.out.println("Browser : "+browserName);
		System.out.println("Environment : "+envName);
	}


}
