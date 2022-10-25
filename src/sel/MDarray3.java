package sel;

public class MDarray3 {

	public static  void array(int[][] a) {
		System.out.println("Elements are :");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		array(a); // pass it to the method
	}

}
