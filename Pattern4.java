package lecture_3;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row <= n) {
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
			nst--;
			row++;
			nsp += 2;
			System.out.println();
		}

	}

}
