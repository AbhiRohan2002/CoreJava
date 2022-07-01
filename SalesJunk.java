
import java.util.Scanner;
class SalesJunk
{
 public static void main(String[] args)
 {
 // get a sales amount from the user using a Scanner object
     Scanner sales=new Scanner(System.in);
      System.out.println("enter sales amount and commission");
      double salesamount=sales.nextDouble();
      double commission=sales.nextDouble();
      double amountCommission=salesamount*commission/100;

 // get a commission rate from the user (e.g. 5 for 5%)
 // calculate and display (on the console) the amount of commission the
 // sales person should be paid (sales * comm) - format to 2 decimal places
      System.out.println("amount of commission the sales person should be paid:"+amountCommission);

      System.out.printf("\n Amount of commission the sales person should be paid:%.2f",amountCommission);
 }
}
