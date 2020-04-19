package Pattern_challenge;

import java.util.Scanner;

public class Manmohan_loves_patterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nst = 2;
		int row = 1;
		System.out.println("1");
		while (row < n) {
			int col = 1;
			while (col <= nst) {
				if (col == 1 || col == nst) {
					System.out.print(row);
				} else
					System.out.print("0");
				col++;
			}
			nst++;
			System.out.println();
			row++;
		}
	}

}
