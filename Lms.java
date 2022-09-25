package coll1;

import java.util.ArrayList;

public class Lms {
	public static void main(String[] args) {
		ArrayList<Integer> lms=new ArrayList<>();
		lms.add(888);
		lms.add(777);
		lms.add(789);
		lms.add(999);
		lms.set(2, 555);
		/*System.out.println(lms.get(3));
		lms.remove(2);
		System.out.println(lms.size());
		System.out.println(lms);
		System.out.println(lms.size());
		lms.add(2, 990);
		System.out.println(lms);*/
		
		lms.add(2, 990);
		System.out.println(lms.size());
		System.out.println(lms);
		
		
	}

}
