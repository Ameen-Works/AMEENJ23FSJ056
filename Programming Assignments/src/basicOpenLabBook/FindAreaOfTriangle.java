package basicOpenLabBook;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the width of the triangle :");
		double width=scan.nextDouble();
		
		System.out.println("Enter the height of the triangle :");
		double height=scan.nextDouble();
		
		scan.close();
		double area=(width*height)/2;
		
		System.out.println("Area of the Trianle is : "+area);
	}

}
