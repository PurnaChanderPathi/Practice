package Collection;

import java.util.ArrayList;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		
		al.add(new Student(33, "Pathi"));
		al.add(new Emp(12, "Purna"));
		
		Object o = al.get(1);
		
		if(o instanceof Emp)
		{
			Emp e1 = (Emp)o;
			System.out.println(e1.emp+""+e1.ename);
		}
		if(o instanceof Student)
		{
			Student s1 = (Student)o;
			System.out.println(s1.sid+""+s1.sname);
		}

	}

}
