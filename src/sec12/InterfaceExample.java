package sec12;

public class InterfaceExample {

	public static void main(String[] args) {
		A a = new A();
		a.printVALUE();
		// Interface01 b = new Interface01();
		// AbstractCalss c = new AbstractClass();
		SubClass d = new SubClass();
		d.method2();
	}
}

class SubClass extends AbstractClass {

	@Override
	void method02() {
		System.out.println("method2");
	}
}

abstract class AbstractClass {
	int x = 1;
	void method1() {
		System.out.println("method1");
	}
	abstract void method02();
}

interface Interface01 {
	int VALUE = 1;
	void printVALUE();
}

interface Interface02 {
	int VALUE = 2;
	void printValue();
}

class A implements Interface01 {

	@Override
	public void printVALUE() {
		System.out.println(Interface01.VALUE);
	}
}