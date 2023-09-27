package Collection;

import java.util.ArrayList;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new  ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> ap = new ArrayList<Integer>(al);
		ap.add(100);
		ap.add(200);
		System.out.println(ap);
		

	}

}
