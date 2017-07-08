package sec11;

public class InheritanceExample02 {

	public static void main(String[] args) {
		Shape[] zukei ={
				new Square(1.5, 2.3),
				new Triangle(2.5, 3.0),
				new Circle(2.2)
		};

		// int[] a = {1, 2, 3
		/*
		zukei[0]= new Square(1.5, 2.3);
		zukei[0].printArea("四角形");

		Shape sankaku = new Triangle(2.5, 3.0);
		// System.out.println("面積は" + sankaku.area() );
		// sankaku.printArea("三角形")
		Shape en = new Circle(2.2);
		// System.out.println("面積は" + en.area() );
		// en.printArea("円");
		 *
		 */
	}
}

// 図形クラス（抽象クラス）
abstract class Shape {
	String name;

	abstract double area();

	void printArea(String str) {
		System.out.println( str + this.toString() + "の面積は、" + area() );
	}
}

// 円クラス (図形クラスを継承)
class Circle extends Shape {
	double hankei;

	// コンストラクタ
	Circle(double hankei) {
		this.hankei = hankei;
		this.name = "円";
	}

	// 面積を求めて返す
	double area() {
		return hankei*hankei*Math.PI;
	}

	// 情報を文字列化して返す
	public String toString() {
		return "（半径＝" + hankei + "）";
	}
}

// 三角形クラス
class Triangle extends Shape {
	double teihen;
	double takasa;

	// コンストラクタ
	Triangle(double teihen, double takasa) {
		this.teihen = teihen;
		this.takasa = takasa;
		this.name = "三角形";
	}

	// 面積を求めて返す
	double area() {
		return teihen*takasa/2;
	}

	// 情報を文字列化して返す
	public String toString() {
		return "（底辺＝" + teihen + ", 高さ＝" + takasa + "）";
	}
}

// 四角形クラス
class Square extends Shape {
	double tate;
	double yoko;

	// コンストラクタ
	Square(double tate, double yoko) {
		this.tate = tate;
		this.yoko = yoko;
		this.name = "四角形";
	}

	// 面積を求めて返す
	double area() {
		// double area = tate*yoko;
		// return area;
		return tate*yoko;
	}

	// 情報を文字列化して返す
	public String toString() {
		return "（縦＝" + tate + ", 横＝" + yoko + "）";
	}
}
