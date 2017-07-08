package packageA;

import static java.lang.Math.*;
import packageB.B;

public class A extends B {
	public static void main(String[] args) {
		A b = new A();
		b.print();
		System.out.println(sin(PI/3));
	}
}

class C {
	
}