package problem01;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = countClap(i);

			if (count == 0) {
				continue;
			}

			System.out.print(i + " ");

			for (int j = 0; j < count; j++) {
				System.out.print("짝");
			}

			System.out.println("");
		}
	}

	public static int countClap(int number) {

		String strNumber = String.valueOf( number );
		int clap = 0;
		int length = strNumber.length();
		
		for( int j = 0; j < length; j++ ) {
			char c = strNumber.charAt( j );
			if( c == '3' || c == '6' || c == '9' ) {
				clap++;
			}
		}

		return clap;
	}
}