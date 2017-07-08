package enumExample;

import java.util.Scanner;

public enum Planet {
	// 惑星名(質量と半径)
	MERCURY(3.303e+23,2.4397e6),
	VENUS		(4.869e+24,6.0518e6),
	EARTH		(5.976e+24,6.37814e6),
	MARS		(6.421e+23,3.3972e6),
	JUPITER	(1.9e+27,	7.1492e7),
	SATURN	(5.688e+26,6.0268e7),
	URANUS	(8.686e+25,2.5559e7),
	NEPTUNE	(1.024e+26,2.4746e7);

	private final double mass;		// 質量(Kg)
	private final double radius;		// 半径(m)

	// コンストラクタ
	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	// private double mass() { return mass; }
	// private double radius() { return radius; }

	// 重力定数(m^3/Kg/s^2)
	public static final double G = 6.67300E-11;

	// 表面重量
	double surfaseWeight(double mass) {
		return mass*surfaceGravity();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double earthWeight = scan.nextDouble();
		double mass = earthWeight / EARTH.surfaceGravity();
		for(Planet planet : Planet.values()) {
			System.out.printf("あなたの体重は %s 上で、 %f kgです%n", planet, planet.surfaceWeight(mass));
		}
	}
}
