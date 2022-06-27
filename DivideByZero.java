class DivideByZero{
	public static void main(String[] args) {
     
     int a=1+(int)(Math.random()*5);
     int b=(int)(Math.random()*5);
     System.out.println(a+"    "+b);

     int c=a+b;
     System.out.println(c);
     
     if(b==0)
     	return;

     int d=a/b;// crash- terminate
     System.out.println(d);
     int e=a*b;
     System.out.println(e);

	}
}