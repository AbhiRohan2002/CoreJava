class A{
	
	int a1=100;

	public static void main(String[] args) {
		
		int a=123;
		int b=321;

		int s=a+b;

		System.out.println("Sum="+s);

		A obj=new A(); // create object

		System.out.println(obj.a1); //CE

        B b1=new B();
		b1.sayHello();
	}
}

