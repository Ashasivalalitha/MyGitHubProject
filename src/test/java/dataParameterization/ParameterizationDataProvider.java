package dataParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationDataProvider {

	@Test(dataProviderClass = ParameterizationDataProvider.class, dataProvider = "testdata") //need to give class details if DataProvider annonation is in a different class
	public void go(String uname,String pwd) {

		System.out.println("Username : "+uname);
		System.out.println("Password : "+pwd);
	}

	@DataProvider(name = "testdata")
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0]= "admin";
		data[0][1]= "a-password";
		data[1][0]= "dealer";
		data[1][1]= "d-password";
		return data;
	}


}
