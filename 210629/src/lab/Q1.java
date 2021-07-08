package lab;

public class Q1 {

	public static void main(String[] args) {
		int line = 7;
		int space = line / 2 + 1;
		int star = 1;

			for (int i = 0; i < line; i++) {
				for (int j = 0; j < space; j++) {
					System.out.print(' ');
				}
				for (int k = 0; k < star; k++) {
					System.out.print("*");
				}
				if (1 < line / 2) {
					space -= 1;
					star += 2;
				}
				else {
					space += 1;
					star -= 2;
				}
				System.out.println();
		        }
			
	}
}
