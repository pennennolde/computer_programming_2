package sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		AA a = new B();
		((B)a).temp();

		System.out.println(a instanceof AA);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);

		B b = new B();

		System.out.println(b instanceof AA);
		System.out.println(b instanceof B);
		System.out.println(b instanceof C);

		AA c = new AA();

		System.out.println(c instanceof AA);
		System.out.println(c instanceof B);
		System.out.println(c instanceof C);

		C d = new B();

		System.out.println(d instanceof AA);
		System.out.println(d instanceof B);
		System.out.println(d instanceof C);

	}
}

class AA {

}

class B extends AA implements C {
	public void temp() {
		System.out.println("temp!");
	}
}

interface C {
	void temp();
}