import java.util.Scanner;

public class Guess{
	public static void main(String[] args) {
		
	 Scanner s=new Scanner(System.in);

     int randomNumber = (int) (Math.random()*101); // 0 - 100
     
     System.out.println("Guess the number:");
     int number=s.nextInt();

     while(number != randomNumber){
     
     if(number>randomNumber)
     	 System.out.println("The number is too high");
     else
     	System.out.println("The number is too low");
      
     System.out.println("Guess the number again:");
     number=s.nextInt();      

     }

    System.out.println("Congrats! Number matched!!");
	}
}