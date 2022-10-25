package sel2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> m = new HashMap<String, String>();
		m.put("name", "sree");
		m.put("lname", "vathsan");
		m.put("fname", "venkatesan");
		// System.out.println(m.get("fname"));
		Set<Entry<String, String>> s = m.entrySet();
		// Iterator<Entry<String, String>> h = s.iterator();
		Iterator h = s.iterator();

		while (h.hasNext()) {
			Map.Entry e = (Map.Entry) h.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}

		Hashtable<String, String> t = new Hashtable<String, String>();
	}

}
