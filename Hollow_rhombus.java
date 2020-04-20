package Pattern_challenge;

import java.util.Scanner;

public class Hollow_rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = n;
		int space = n - 1;
		while (row <= n) {
			int nsp = 1;
			while (nsp <= space) {
				System.out.print(" ");
				nsp++;
			}
			int col = 1;
			if (row == 1 || row == n) {
				while (col <= nst) {
					System.out.print("*");
					col++;

				}
			} else {
				while (col <= nst) {
					if (col == 1 || col == n) {
						System.out.print("*");

					} else {
						System.out.print(" ");
					}
					col++;
				}
			}
			row++;
			System.out.println();
			space--;

		}

	}
}