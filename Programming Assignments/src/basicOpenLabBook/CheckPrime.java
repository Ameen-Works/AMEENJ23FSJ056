package basicOpenLabBook;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=scan.nextInt();
		scan.close();
		
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		if (isPrime) {
			System.out.println(num+" is Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime number");
		}
	}

}
