package Task2;

public class PyramidInverted {
	public static void drawPyramid(int n) {
        drawPyramidInverted(n, 1);
    }

    private static void drawPyramidInverted(int n, int row) {
        if (n <= 0) {
            return ;
        }

        if (row <= n) {
        	drawPyramidInverted(n, row + 1);
            printSpaces(n - row);
            printStars(2 * row - 1);
            System.out.println();
        }
    }

    private static void printSpaces(int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }

    private static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }

   
    public static void main(String[] args) {
        int n = 4; 
        drawPyramid(n);
        
    }
}
