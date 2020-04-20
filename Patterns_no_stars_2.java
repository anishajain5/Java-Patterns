package Pattern_challenge;

import java.util.Scanner;

public class Patterns_stars_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int no = 1;
		int nst = n - 1;
		while (row <= n) {
			int col = 1;
			while (col <= no) {
				System.out.print(col);
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			nst--;
			row++;
			no++;
			System.out.println();
		}

	}

}
