package basicOpenLabBook;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbe below 10 :");
		number=scan.nextInt();
		scan.close();
		while(number<=10) {
			sum+=number;
			number++;
		}
		System.out.format("Sum of the Numbers from While loop is: %d", sum);
		
		
	}

}
