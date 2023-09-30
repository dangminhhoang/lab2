package Task1;

public class PasscalTriangle {
	//....
			// This method is used to display a Pascal triangle based on the parameter n.
			// Where n represents the number of rows
			public static void printPascalTriangle(int row) {
				for (int i = 0; i < row; i++) {
		            for (int j = 0; j <= i; j++) {
		                System.out.print(getPascalValue(i, j) + " ");
		            }
		            System.out.println();
		        }
			}
			// get the nth row. 
			//For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
			public static int[] getPascalTriangle(int n) {
				int[] row = new int[n];
		        for (int i = 0; i < n; i++) {
		            row[i] = getPascalValue(n - 1, i);
		        }
		        return row;
			}
			// generate the next row based on the previous row
			//Ex. prevRow = {1} ==> nextRow = {1, 1}
			//Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
			public static int[] generateNextRow(int[] prevRow) {
				int[] nextRow = new int[prevRow.length + 1];
		        nextRow[0] = 1;
		        nextRow[prevRow.length] = 1;
		        for (int i = 1; i < prevRow.length; i++) {
		            nextRow[i] = prevRow[i - 1] + prevRow[i];
		        }
		        return nextRow;
			}
			private static int getPascalValue(int row, int col) {
		        if (col == 0 || col == row) {
		            return 1;
		        } else {
		            return getPascalValue(row - 1, col - 1) + getPascalValue(row - 1, col);
		        }
		    }
			public static void main(String[] args) {
				int row = 5;
		        printPascalTriangle(row);

		        int n = 5;
		        int[] nthRow = getPascalTriangle(n);
		        System.out.print("Row " + n + ": ");
		        for (int value : nthRow) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
}
