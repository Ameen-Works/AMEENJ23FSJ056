package basicOpenLabBook;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number to reverse :");
		int num=scan.nextInt();
		scan.close();
		int i=0;
		String reverseNum="";
		while(num!=0) {
			i=num%10;
			reverseNum+=i;
			num=num/10;
		}
		System.out.println("Reverse of input number is : "+reverseNum);
	}

}
