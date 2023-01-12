package z_javaproj;

public class SingleTon1 {

public static void main(String[] args) {
	
	
	String s1 = new String("hi");
	String s2 = new String("hi");
	
	System.out.println(s1==s2); //false
	System.out.println(s1.equals(s2)); //true
	
	
	//to make the above 'false' to 'true'
	System.out.println("After applying Singleton:");
	
	SingleTon2 si1 = SingleTon2.getObject();
	SingleTon2 si2 = SingleTon2.getObject();
	
	System.out.println(si1==si2); 
	System.out.println(si1.equals(si2));
}
	
}
