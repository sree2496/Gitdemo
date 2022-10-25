package sel;

public class ThisDemo {

	int a = 2;

	public void get() {
		int a = 3;
		System.out.println(this.a + a);

	}

	static int s = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo t = new ThisDemo();
		t.get();
		s = s+s;
	}

}
