package Task1;

public class TowerOfHanoi {
	public static void hanoi(int n, char cot1, char cot2, char cot3) {
	    if (n == 1) {
	        System.out.println("di chuyen dia thu nhat tu " + cot1 + " den " + cot3);
	        return;
	    }

	    hanoi(n - 1, cot1, cot3, cot2);

	    System.out.println("di chuyen dia thu" + n + " tu " + cot1 + " den " + cot3);

	    hanoi(n - 1, cot2, cot1, cot3);
	}

	public static void main(String[] args) {
	    int numberOfDisks = 3;
	    hanoi(numberOfDisks, 'A', 'B', 'C');
	}
}
