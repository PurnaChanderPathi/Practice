package Collection;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("purna");
		al.add("Pathi");
		al.add(10);
		al.add(null);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, "Chandu");
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(2);
		al.remove("Chandu");
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		al.clear();
		System.out.println(al.isEmpty());
	}

}
