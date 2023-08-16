package basicClosedLabBook;

public class DefaultValuesAssignmentsTypeCastings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 0;
		char ch = 0;
		
		short s = 0;
		int i=10;
		
	
		long l = 0;
		
		double d = 0;
		float f = 0;
		
		String st = null;
		boolean boo = false;
		
		System.out.println("Default value of Byte is : "+ b+
				"\n Default value of Char is : "+ch+
				"\n Default value of Short is : "+s+
				"\n Default value of Int is : "+i+
				"\n Default value of Long is : "+l+
				"\n Default value of Double is : "+d+
				"\n Default value of Float is : "+f+
				"\n Default value of String is : "+st+
				"\n Default value of Boolean is : "+boo);
		
		//Explicit Type Casting
		b=(byte)i;
		b=(byte)s;
		b=(byte)d;
		b=(byte)l;
		b=(byte)f;
		b=(byte)ch;
		b=Byte.parseByte(st);
		
		ch=(char)b;
		ch=(char)i;
		ch=(char)s;
		ch=(char)d;
		ch=(char)l;
		ch=(char)f;
		
		
		s=(short)i;
		s=(short)d;
		s=(short)l;
		s=(short)f;
		s=(short)ch;
		s=Short.parseShort(st);
		

		i=(int)d;
		i=(int)l;
		i=(int)f;
		i=Integer.parseInt(st);
		
		d=Double.parseDouble(st);
		d=(double)f;
		d=(double)l;
		
		l=(long)d;
		l=(long)f;
		l=Long.parseLong(st);
		
		f=(float)d;
		f=Float.parseFloat(st);
		
		
		//Implicit Type Casting
		s=b;
		
		i=b;
		i=ch;
		i=s;	
		
		d=b;
		d=s;
		d=ch;
		d=i;		
		d=l;
		d=f;
		
		l=b;
		l=s;
		l=ch;
		l=i;
				
		f=b;
		f=s;
		f=ch;
		f=i;
		f=l;		

	}

}
