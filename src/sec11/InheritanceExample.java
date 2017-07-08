package sec11;

import java.awt.Color;

public class InheritanceExample {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		// System.out.println("p=(" + p.getX() + "," + p.getY() + ")");
		p.print("p");
		Point q = new Point(11,22);
		// System.out.println("q=(" + q.getX() +"," + q.getY() + ")");
		q.print("q");

		ColorPoint cp = new ColorPoint(100, 200, Color.yellow);
		// cp.setX(100);
		// cp.setY(200);
		// cp.setColor(Color.yellow);
		// System.out.println("cp=(" + cp.getX() + "," + cp.getY() + "):color=" + cp.getColor());
		cp.print("cp");

		Point s = new ColorPoint(1, 2, Color.blue);
		//System.out.println(s.getColor()); これはできない
		// ColorPoint t = new Point(1, 2); これはできない
		s.print("s");
		Color c = ((ColorPoint) s).getColor(); //キャスト
		System.out.println("c=" + c);

		Point[] u = new Point[2];
		u[0] = new Point();
		//c = ((ColorPoint)u[0]).getColor(); できない、エラー
		u[1] = new ColorPoint(1, 2, Color.cyan);
		u[0].print("u0");
		u[1].print("u1");
	}
}

class Point {
	private int x;
	private int y;

	Point() {
		// ここは空
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void setX(int x) {
		if( x<5 ) this.x = 5;
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

	int getX() {
		return this.x;
	}

	int getY() {
		return y;
	}

	void print(String name) {
		System.out.printf("%s=(%d,%d)%n", name, x, y);
	}
}

class ColorPoint extends Point {
	Color color;

	ColorPoint(int x, int y, Color color) {
		super(x, y);
		// this.setX(x);
		// this.setY(y); これでもいい
		this.color = color;
	}

	Color getColor() {
		return color;
	}

	void setColor(Color color) {
		this.color = color;
	}

	void print(String name) {
		System.out.printf("%s=(%d,%d):color=%s%n", name, getX(), getY(), color);
	}

	//Color getColor() {
		//return color;
	//}
}
