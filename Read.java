/*Write a program that requests a final grade.
Use while-loop to request the grade continuously as long as the grade entered is invalid. 
A grade is invalid if it is less than 0 or greater than 100. 
After a valid grade is entered, display it on the screen*/
import java.util.Scanner;
class Read{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Pls enter grade");
		double grade=s.nextDouble();

		while(grade>=0 && grade<=100){
			System.out.println("your grade "+grade);

        System.out.println("Pls enter grade");
		 grade=s.nextDouble();

		}
	}
}