package Pattern_challenge;

import java.util.Scanner;

public class Manmohan_lovesPatterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int nst = 1;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				if (row % 2 != 0) {
					System.out.print("1");
					col++;
				} else {
					if (col == 1 || col == nst) {
						System.out.print("1");
					} else {
						System.out.print("0");
					}
					col++;
				}
			}
			System.out.println();
			row++;
			nst++;
		}

	}

}
