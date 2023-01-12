package z_javaproj;

public class DataProvider {

	public static void main(String[] args) {
	
		Object[][] data = new Object[1][3];
		
		data[0][0]= "Money";
		data[0][1]= "Redesign/Poll archive";
		data[0][2]= "50";
		
		System.out.println(data[0][0]);
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		
		String noOfItemsInThePage = "displayed 50 Items";
		noOfItemsInThePage=noOfItemsInThePage.replaceAll("[^0-9]", "");
		System.out.println(noOfItemsInThePage);

	}

}
