package lecture_3;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int row = 1;
		int nst = 1;
		int value = 1;
		while (row <= n) {
			int col = 1;
			while (col <= nst) {
				System.out.print(value);
				value++;
				col++;
			}
			nst++;
			System.out.println();
			row++;
		}

	}

}
