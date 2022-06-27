class Demo{
	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		System.out.println(a + " \n"+b);
		if(a==b)
			System.out.println(a +" and " +b +" are equal");
		else if(a<b)
			System.out.println(a +" is less than " +b );
		else 
			System.out.println(a +" is greater than " +b );
	}

}