package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;
//		char charValue = 'a';
//		short shortValue = charValue;
		float var4 = 10;
		System.out.println(var4);
//		byte byteValue = 10;
//		byte result = byteValue + byteValue;
	}

}
