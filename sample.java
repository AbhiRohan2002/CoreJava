// by default java.lang package is imported 

class Sample{
 public static void main(String[] args) {
   int sum=0;
 	for(int i=0;i<10;i++){
    int a = 1+ (int) (Math.random() * 10);
   sum=sum+a;
   System.out.println(a);
   }
   System.out.println("sum= " +sum);
}
}
	

	

