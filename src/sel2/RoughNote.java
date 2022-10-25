package sel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RoughNote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		String y = Integer.toString(x);

		 if (((Object) y).getClass().getSimpleName().contentEquals("String")) {
			 System.out.println("Good Job");
		 }
		 else {
			 System.out.println("wrong answer");
		 }
		//System.out.println(y);
		//System.out.println("good job");
		/*
		 * String a = "sreevathsan";
		 * 
		 * char q; System.out.print("the vowels in the string are ");
		 * ArrayList<Character> newAL = new ArrayList<Character>(); for (int i = 0; i <
		 * a.length(); i++) { q = a.charAt(i); if (q == 'a' || q == 'e' || q == 'i' || q
		 * == 'o' || q == 'u') { System.out.print(q + " "); // OUTPUT 1: LIST OF VOWELS
		 * newAL.add(q); }
		 * 
		 * } System.out.println(); System.out.println("vowel count in the string is  " +
		 * newAL.size()); // OUTPUT 2 : COUNT OF VOWELS IN THE // PROGRAM
		 */
	}
}
