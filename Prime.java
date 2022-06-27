// find whether a given number is prime or not?

class Prime{
 public static void main(String[] args) {
 	int n=1+ (int)(Math.random()*1000000);
 	System.out.println(n);
 	boolean prime=false;

 	for(int i=2;i<=n/2;i++){
     if(n%i==0){
       prime=true;
       break;
    }
 }

   if(!prime)
   System.out.println(n +" is prime");
   else
   	System.out.println(n +" not prime");
   
 	}

}