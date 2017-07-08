package persons;

public class Person {
	private String nameKanji;
	private String nameYomi;
	private String sex;
	private String birthday;
	private String work;
	private String home;

	Person(String lineData) {
		String[] data = lineData.split(",");
		nameKanji = data[0];
		nameYomi = data[1];
		sex = data[2];
		birthday = data[3];
		work = data[4];
		home = data[5];
	}

	public void print() {
		System.out.printf("%s(%s)%s:%s:%s(%s)", nameKanji, nameYomi, work, sex, home, birthday);
		System.out.println();
	}
	
	public String getSex() {
		return sex;
	}
}
