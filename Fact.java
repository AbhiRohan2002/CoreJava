//find factorial of  given number - use cmd line argument

class Fact{
	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]); // CMD line
       
        int sum=0;

        for(int i=1; i<=n/2;i++){

        	if(n%i==0){
        		sum+=i; // sum=sum+i;
        		System.out.println(i);
        	}
        }

         if(sum==n)
         System.out.println(n +"is perfect");
         else
         System.out.println(n +"is not perfect");         
        
	}
}