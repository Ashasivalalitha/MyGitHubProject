package z_javaproj;

public class ReflectionAPI extends ReflectionAPI2 {
	
	public static void main(String[] args) {
		
		ReflectionAPI r = new ReflectionAPI();
		
		System.out.println(r.getClass());
		System.out.println(r.getClass().getName());
		System.out.println(r.getClass().getSimpleName());
		System.out.println(r.getClass().getDeclaredMethods()[2]);
		
	}
	
	
	private void first() {
	System.out.println("first method");

	}
	
	private void second() {
		System.out.println("second method");

		}
	
	private void third() {
		System.out.println("third method");

		}
	
}
