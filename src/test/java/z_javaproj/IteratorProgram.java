package z_javaproj;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class IteratorProgram {

	@Test
	//public static void main(String[] args) {
		private void go() {
			

ArrayList<Integer> al = new ArrayList<Integer>();
al.add(1);
al.add(5);
al.add(2);
al.add(10);
al.add(0);

//Iterator
Iterator<Integer> it = al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

//Foreach
System.out.println("foreach:");
for (Integer each : al) {
	System.out.println(each);
}

	}
}
