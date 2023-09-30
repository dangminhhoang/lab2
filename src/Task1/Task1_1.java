package Task1;

public class Task1_1 {
	// S(n)=1-2+3-4+…+ ((-1)^(n+1) ).n , n>0
		public static int getSn1(int n) {
			if (n == 1) {
				return 1;
			}
			if (n % 2 == 0) {
				return -n + getSn1(n - 1);
			} else {
				return n + getSn1(n - 1);
			}
		}

		// S(n)=1+1.2+1.2.3+…+1.2.3…n, n>0
		public static int getSn2(int n) {
			if(n==1) {
				return 1;
			}
			return getSn2(n-1)+Fac(n);
		}
		public static int Fac(int n) {
			if(n==1) {
				return 1;
			}
			return n * Fac(n-1);
		}

		// S(n)=1^2+2^2+3^2+....+n^2 , n>0
		public static int getSn3(int n) {
			if(n==1) {
				return 1;
			}
			return n*n+getSn3(n-1);
		}

		// S(n)=1+1/2+1/(2.4)+1/(2.4.6)+…+1/(2.4.6.2n), n>=0
		public static double getSn4(int n) {
			if (n==0) {
				return 1.0;
			}
			return 1.0/ (mau(n))+getSn4(n-1);
		}
		public static double mau(int n) {
			if (n==0) {
				return 1;
			}
			return 2*n*mau(n-1);
		}
	public static void main(String[] args) {
		int n=5;
		System.out.println(getSn1(n));
		System.out.println(getSn2(n));
		System.out.println(getSn3(n));
		System.out.println(getSn4(n));
	}
}
