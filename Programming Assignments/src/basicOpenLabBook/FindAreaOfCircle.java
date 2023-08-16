package basicOpenLabBook;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		double radius=scan.nextDouble();
		scan.close();
		
		double area=Math.PI*(radius*radius);
		double circumference=2*Math.PI*radius;
		
		System.out.println("Area of the circle is : "+area);
		System.out.println("Circumference of the circle is : "+circumference);
		
	}

}
