package sel;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mathss {

	public static void main(String[] args) {

		Date d = new Date();
		// System.out.println(d.toString());

		// System.out.println(s.format(d));

		Calendar c = Calendar.getInstance();
		SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(s.format(c.getTime()));
		int s1 = Calendar.DAY_OF_WEEK_IN_MONTH;
		System.out.println(s1);
	}

}
