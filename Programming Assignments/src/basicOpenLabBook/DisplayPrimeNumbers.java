package basicOpenLabBook;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int num=0;
		String primeNumbers="";
		while(i<=100) {
			int counter=0;
			num=i;
			while(num>=1) {
				if(i%num==0) {
					counter++;
				}
				
				num--;
			}
			if(counter==2) {
				primeNumbers= primeNumbers+i+" ";
			}
			
			i++;
		}
		System.out.println("Prime Numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
