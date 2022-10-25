package sel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {

//	List<Integer> q = Arrays.asList( 1, 2, 2, 3, 3, 3, 4);
//	 List<Integer> z = q.stream().distinct().collect(Collectors.toList());

		// System.out.println(z);
		int[] a = { 1, 2, 2, 3, 3, 3, 4 };
		ArrayList<Integer> b = new ArrayList<Integer>();
		System.out.println("before adding" + b);
		System.out.println("length of a is " + a.length);
		for (int i = 0; i <a.length; i++) {
			int k = 0;
			if (!b.contains(a[i])) {
				b.add(a[i]);
				k++;
				for (int j = i + 1; j <a.length; j++) { // j value is 2 , comparing to other digits in the array a till 7th
													// place.
					if (a[i] == a[j]) { // checks if 1 is equal to 2. i.e., a[0]== a[1] (since j + j+1)
						k++;
					}

				}
				System.out.println(a[i] + " is repeated " + k + " times");
			}
			if (k == 1) {
				System.out.println(a[i] + " is unique number");
			}
		}

	}
}