package basicOpenLabBook;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle :");
		double length=scan.nextDouble();
		System.out.println("Enter the width of the rectangle :");
		double width=scan.nextDouble();
		
		scan.close();
		
		System.out.println("Area of the rectangle is :"+length*width);
	}

}
