package Collection;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> p = new ArrayList<Emp>();
		p.add(new Emp(33, "Purna"));
		p.add(new Emp(44, "Pathi"));
		
		for(Emp e:p)
		{
			System.out.println(e.emp+""+e.ename);
		}
		
		Emp e = p.get(0);
		System.out.println(e.emp+""+e.ename);

	}
	


}
