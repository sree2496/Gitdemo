package sel2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		System.out.println(a);
		a.add("sree");
		a.add("sree");
		System.out.println(a);
		a.add("vathsan");
		System.out.println(a);
		a.add(0, "INITIAL V");
		System.out.println(a);
		a.add(1, "pudhusu");
		System.out.println(a);
		a.remove(0);
		a.remove("vathsan");
		System.out.println(a);
		System.out.println(a.get(1));
		a.add(0, "onedaw");
		System.out.println(a.contains("sree"));
		System.out.println(a);
		System.out.println(a.indexOf("sree"));
		System.out.println("size is " + a.size());
	}

}
