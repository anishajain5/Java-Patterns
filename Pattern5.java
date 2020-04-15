package lecture_3;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = 0;
		int rows = 2 * n - 1;
		int nst = 5;
		int row = 1;
		while (row <= rows) {
			int col = 1;
			while (col <= nsp) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			if (row < n) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}
			System.out.println();
			row++;

		}

	}

}
