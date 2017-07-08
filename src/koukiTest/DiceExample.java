package koukiTest;

public class DiceExample {

	public static void main(String[] args) {
		int[] rate = { 1, 2, 4, 3, 2, 1 };
		Dice dice = new Dice( rate );
		int[] count = new int[ rate.length ];
		for( int i = 0; i < count.length; i++ ) {
			count[i] = 0;
		}

		int n = 10000;
		for( int i = 0; i < n; i++ ) {
			int value = dice.toss();
			count[ value ] += 1;
		}

		System.out.println("サイコロの1の目が出た確立=" + (double)count[0]/n );
		System.out.println("サイコロの2の目が出た確立=" + (double)count[1]/n );
		System.out.println("サイコロの3の目が出た確立=" + (double)count[2]/n );
		System.out.println("サイコロの4の目が出た確立=" + (double)count[3]/n );
		System.out.println("サイコロの5の目が出た確立=" + (double)count[4]/n );
		System.out.println("サイコロの6の目が出た確立=" + (double)count[5]/n );
	}
}


class Dice {

	int total;
	int[] boundary = new int[ 6 ];

	Dice ( int[] rate ) {
		for( int i = 0; i < rate.length; i++ ) {
			total += rate[i];
			boundary[i] = rate[i];
		}
	}

	int toss() {
		double value = total * Math.random();
		if( value < boundary[0] ) {
			return 0;
		} else if( value <  boundary[0] +boundary[1] ) {
			return 1;
		} else if( value < boundary[0] +boundary[1]+boundary[2] ) {
			return 2;
		} else if( value < boundary[0] +boundary[1]+boundary[2]+boundary[3] ) {
			return 3;
		} else if( value < boundary[0] +boundary[1]+boundary[2]+boundary[3]+boundary[4] ) {
			return 4;
		} else {
			return 5;
		}
	}
}
