package sel;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String space = " ";
		int TotalSpaces = 15;
		int numMax = 3;
		int newCount = 0;

		Scanner sc = new Scanner(System.in);
				System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			String y = Integer.toString(x);

			if (s1.length() < TotalSpaces) {
				if (y.length() < numMax  || y.length() ==3 ) {
					String z = String.format("%03d", x);
					newCount = TotalSpaces - s1.length();
					System.out.println(s1 + space.repeat(newCount) + z);
				}
			}

		}

		System.out.println("================================");
	}
}
