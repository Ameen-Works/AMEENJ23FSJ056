package basicOpenLabBook;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int i= scan.nextInt();
		scan.close();
		String result=(i%2==0)?(i+" is even"):(i+ "is odd");
		
		System.out.println(result);
	}

}
