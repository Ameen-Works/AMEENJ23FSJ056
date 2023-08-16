package basicOpenLabBook;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		
		int i=b;
//		byte c=i; Need a type cast
		byte d=(byte) i;
		byte x=1;
		byte y=20;
		System.out.println(x+y+d);
//		byte mul=x*y;// Arithmetic operations are not possible with Byte
	}

}
