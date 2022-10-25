package sel2;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 3, 3, 4 };

		ArrayList<Integer> ab = new ArrayList<Integer>();
		System.out.println(ab);

	for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				System.out.println(a[i] + " is repeated " + k + " times");

				if (k == 1)
					System.out.println(a[i] + " is unique number");
			}
		}

	}

}
