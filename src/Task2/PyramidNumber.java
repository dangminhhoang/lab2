package Task2;

public class PyramidNumber {
	public static void drawPyramid(int n) {
        drawPyramidNumber(n, 1);
    }

    private static void drawPyramidNumber(int n, int row) {
        if (n <= 0) {
            return ;
        }

        if (row <= n) {
        	
            printSpaces(n - row);
            printNumber(row);
            System.out.println();
            drawPyramidNumber(n, row + 1);
        }
    }

    private static void printSpaces(int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }

    private static void printNumber(int count) {
    	if (count > 0) {
            System.out.print(count+" ");
            printNumber(count - 1);
        }
    }

   
    public static void main(String[] args) {
        int n = 4; 
        drawPyramid(n);
        
    }
}
