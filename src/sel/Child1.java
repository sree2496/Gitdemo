package sel;

public class Child1 extends Parent {

	public int sree(int a, int b) {
		int c = a + b;
		return c;
	}

	public void sree(int a, int b, String s) {
		int c = a * b;
		System.out.println("the output is " + c + " and the string is " + s);

	}

	public void engine() {
		System.out.println("this is new gen engine");
	}

	public void colour() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		Child1 c = new Child1();
		Parent p = new Child1();
		c.engine();
		

		/*
		 * System.out.println(c.sree(15, 45)); c.sree(14, 17, "sree");
		 * System.out.println(c.sree(10, 20)); /* c.gear(); c.colour(); c.brakes();
		 */

	}

}
