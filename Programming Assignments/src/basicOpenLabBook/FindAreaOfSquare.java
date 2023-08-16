package basicOpenLabBook;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of square :");
		Scanner scan =new Scanner(System.in);
		int side=scan.nextInt()	;
		scan.close();
		
		System.out.println("Area of the square is :"+side*side);
	}

}
