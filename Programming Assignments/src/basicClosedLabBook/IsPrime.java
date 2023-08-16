package basicClosedLabBook;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=scan.nextInt();
		scan.close();
		boolean isPrime=true;
		System.out.print(num+" Is Divisible by 1, ");
		for(int i=2; i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+", ");
				isPrime=false;
				
			}
		}
		System.out.print(num+"\n");
		
		if(isPrime){
			System.out.println(num+" is Prime Number");
		}
		else {
			System.out.println(num+" is not Prime Number");
		}
		
	}

}
