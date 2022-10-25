package sel2;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		System.out.println(s);
		s.add("1a");
		System.out.println(s);
		s.add("2b");
		System.out.println(s);
		s.add("3c");
		System.out.println(s);

		System.out.println(s.size() + "is the size");
		Iterator<String> j = s.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}
	}

}
