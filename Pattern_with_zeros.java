package Pattern_challenge;

import java.util.Scanner;

public class Pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				if (col == 1 || col == nst) {
					System.out.print(row + "\t");
				} else
					System.out.print("0" + "\t");
				col++;
			}
			nst++;
			System.out.println();
			row++;
		}

	}

}
