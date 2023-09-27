package Collection;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Emp(3, "purna"));
		al.add(new Student(4, "Pathi"));
		al.add("Krishna");
		al.add(10.5);
		al.add('P');
		al.add(null);
		System.out.println(al);
		
		for(Object o :al)
		{
			if(o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println(e.emp+""+e.ename);
			}
			if(o  instanceof Student)
			{
				Student s = (Student)o;
				System.out.println(s.sid+""+s.sname);
				
			}
			if(o instanceof String)
			{
				System.out.println(o);
			}
			if(o instanceof Double)
			{
				System.out.println(o);
			}
			if(o instanceof Character)
			{
				System.out.println(o);
			}
			if(o==null)
			{
				System.out.println(o);
			}
		}
		
	}

}
