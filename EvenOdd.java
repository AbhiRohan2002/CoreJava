import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args) {
		int esum=0,osum=0;
		int a=0;
		int min=0,max=0;
		
		Scanner in=new Scanner(System.in);

        System.out.println("enter 5 number");

		for(int i=0;i<5;i++){
        a=in.nextInt(); 
         // min max
        if(i==0){
        min=a;
        max=a;
        }

        if(a>max)
        	max=a;

        if(a<min)
        	min=a;

        // finding even or odd
        if(a%2==0){
        	esum=esum+a;
        	System.out.println(a +" is even");
        }
        else {
        osum += a;
        System.out.println(a +" is odd");
        }
        // +ve and -ve
        if(a>0)
        		System.out.println(a +" is positive");
        else if(a<0)
        		System.out.println(a +" is negative");
        else 
                System.out.println(a +" zero");
        }

        System.out.println("sum of even no="+esum);
        System.out.println("sum of odd no="+osum);

        System.out.println(min +"  "+max);


     }   
	}
