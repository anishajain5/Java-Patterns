package lecture_3;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int inc = 1;
		int dec = 0;
		int nsp = n - 1;
		while (row <= n) {
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			int value = row;
			col = 1;
			while (col <= inc) {
				System.out.print(value);
				value++;
				col++;
			}
			value = value - 2;

			col = 1;
			while (col <= dec) {
				System.out.print(value);
				value--;
				col++;
			}
			nsp--;
			inc++;
			dec++;
			row++;
			System.out.println();
		}

	}

}
