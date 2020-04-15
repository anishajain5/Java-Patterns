package lecture_3;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 5;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			nst--;
			row++;
		}

	}

}
