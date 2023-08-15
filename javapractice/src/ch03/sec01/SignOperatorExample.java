package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x:" + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);

		int p = 1000000;
		int q = 1000000;
		int r = p*q;
		System.out.println("r: "+ r);
		double v = 0.1 * 7;
		System.out.println("실수: "+v);
	}

}
