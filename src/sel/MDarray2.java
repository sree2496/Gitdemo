package sel;

import sel2.MD2;

public class MDarray2 {
	// int[][] a = { { 4, 9, 6 }, { 1, 8, 7 }, { 2, 3, 5 } };
	// int[][] b = { { 24, 39, 16 }, { 1, 8, 7 }, { 2, 3, 5 } };
	public static int s = 100;

	/*
	 * public void method1(int[][] a, String s) {
	 * 
	 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
	 * System.out.print(a[i][j] + "   " + s + " "); } System.out.println(); } }
	 */

	public static void main(String[] args) {
		MDarray2 n = new MDarray2();
		System.out.println(MDarray2.s + "is class 1 value");
		s = 100 * 2;
		MD2.printx();

	}

}

/*
 * public static void arrayex(int[][] a) { for (int i = 0; i < 3; i++) { for
 * (int j = 0; j < 3; j++) { System.out.print(a[i][j] + " "); if (a[i][j] < min)
 * { min = a[i][j]; mincol = j; } }
 * 
 * System.out.println(); }
 * 
 * for (int k = 0; k < 3; k++) { if (a[k][mincol] > max) { max = a[k][mincol]; }
 * 
 * } System.out.println("min num is " + min + " and max num in the mincol is " +
 * max); }}
 * 
 * int min = a[0][0]; int mincol = 0; int max =
 * a[0][mincol];System.out.println("min num is "
 * +min+" and max num in the mincol is "+max);
 * 
 * }
 * 
 * 
 * 
 * int a[][] = { { 9, 0, 8 }, { 2, 4, 6 }, { 7, 3, 1 } }; arrayex(a);
 * 
 * } }
 */
