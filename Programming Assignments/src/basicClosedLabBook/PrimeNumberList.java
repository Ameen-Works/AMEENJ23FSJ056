package basicClosedLabBook;

public class PrimeNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2 ");
		for(int i=1;i<=100;i++) {
			if(isPrime(i))
			System.out.print(i+" ");
		}
		

	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		boolean isPrime=false;
		for(int j=2;j<i;j++) {
			isPrime=true;
			if(i%j==0) {
				isPrime=false;
				return isPrime;
			}
		}
		return isPrime;
	}

}
