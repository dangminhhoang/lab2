package Task2;

public class Pyramid {
	 public static void drawPyramid(int n) {
	        drawPyramidRecursive(n, 1);
	    }

	    private static void drawPyramidRecursive(int n, int row) {
	        if (n <= 0) {
	            return ;
	        }

	        if (row <= n) {
	        	
	            printSpaces(n - row);
	            printStars(2 * row - 1);
	            System.out.println();
	            drawPyramidRecursive(n, row + 1);
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
	            System.out.print("X");
	            printStars(count - 1);
	        }
	    }

	   
	    public static void main(String[] args) {
	        int n = 4; 
	        drawPyramid(n);
	        
	    }
}
