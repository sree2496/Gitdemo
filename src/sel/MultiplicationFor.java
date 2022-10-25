package sel;

import java.util.Scanner;

public class MultiplicationFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the noOfTimes to be multiplied: ");
		int noOfTimes = sc.nextInt();
		//System.out.println("enter the number of value to be multiplied: ");

		int digit = sc.nextInt();

		for (int i = 0; i <= noOfTimes; i++) {
			System.out.println(digit + " x " + i + " = " + digit * i);
		}
*/
		Scanner sc = new Scanner(System.in);
	    
	    int noOfTimes = sc.nextInt();
	   
	    int digit = sc.nextInt();

	    for (int i = 1; i <= 10; i++) {
	      System.out.println(digit + " x " + i + " = " + digit * i);
	    }

	}
}
