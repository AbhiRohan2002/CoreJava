import java.util.Scanner;
public class ScannerExercise {
 public static void main(String[] args) {
 
 // construct a scanner to get keyboard input
 Scanner in=new Scanner(System.in);
 // ask the user for a decimal number
 System.out.print("Enter a decimal number: ");
 // (add the stmt to retrieve the value and store in an
 // appropriate variable) 
 double n=in.nextDouble();
 
 // calculate the number times itself (the square)
 // and store in an appropriate variable (which needs
 // to be declared - see last statement below where
 // the variable is being used) 
 double square=n*n;
 
 // user wants to see the result, this is finished so
 // nothing to do here unless you used different variable name)
 System.out.println("Your number squared is "+ square);
 }
}
