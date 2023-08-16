package basicOpenLabBook;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first=2.50f, second=4.50f;
		System.out.println("--Before Swap--");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+second);
		
		float temp=first;
		first=second;
		second=temp;
		
		System.out.println("--After Swap--");
		System.out.println("First number = "+first);
		System.out.println("Second number = "+second);
	}

}
