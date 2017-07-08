package sec11;

public class ConstractorExample {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(10);
		B b1 = new B();
		B b2 = new B(20);
	}
}

class A  implements B1, B2 {
	public void b1Print() {
		System.out.println("b1Print");
	}
}
interface B1 {
	int b1 = 10;
	void b1Print();
}

	A() {
		System.out.println("Constractor A()");
	}
	A(int x) {
		System.out.println("Constractor A(int)");
	}
}

class B extends A {
	B (int x) {
		System.out.println("Constractor B(int)");
	}
}