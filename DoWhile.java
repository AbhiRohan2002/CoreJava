import java.util.Scanner;

class DoWhile{

	public static void main(String[] args) {
		
     Scanner in=new Scanner(System.in);

     double sum=0.0;
     char keepGoing;

     do{
      System.out.println("Enter test result");
      sum=sum+in.nextDouble();

      System.out.println("Do you wish to enter another test result? (Yes / No  Y/N)");
      keepGoing=in.next().toUpperCase().charAt(0); //
      
      } while(keepGoing =='Y');
   
      System.out.println(sum);

	}
}