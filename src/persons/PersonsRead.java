package persons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonsRead {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner dataFile = new Scanner(new File("persons.csv"),"SJIS");

		Person[] persons = new Person[7000];
		int count = 0;
		while( dataFile.hasNextLine() ) {
			String dataLine = dataFile.nextLine();
			persons[count] = new Person(dataLine);
			count++;
		}
		// countに人数が入っているはず！
		for(int i=0; i<count; i++) {
			System.out.printf("%4d", (i+1));
			persons[i].print();
		}

		// 男女の人数を求める
		int male = 0;
		int female = 0;
		for(int i=0; i<count; i++) {
			String sex = persons[i].getSex();
			if( sex.equals("男") ) {
				male++;
			} else if( sex.equals("女") ) {
				female++;
			}
		}
		System.out.printf("男：%d人、女：%d人", male, female);
		System.out.println();
	}
}
