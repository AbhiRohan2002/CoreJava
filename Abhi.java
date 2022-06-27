class Abhi{
	public static void main(String[] args){
		int sum1=0;
		int sum2=0;
		for(int i=0;i<25;i++){
			int a= 1 +(int)(Math.random()*25);
           if(a%2==0)
           	sum1=sum1 + a;
           	else 
           	sum2=sum2 + a;
           	}
		System.out.println("even " +sum1);
		System.out.println("odd " +sum2);
	}


}