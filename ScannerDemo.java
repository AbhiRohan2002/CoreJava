import java.util.Scanner; // importing Scanner class
class ScannerDemo{
	
	public static void main(String[] args) {
		// creating object
		
		Scanner a=new Scanner(System.in);
         System.out.println("Enter length,width and cost");
      
        int length=a.nextInt();
        int width=a.nextInt();
        int cost=a.nextInt();
        int tax=13;
        int stotal=length*width*cost;
        System.out.println("Cost of your vertical blinds:");
        System.out.println("sub total: $"+stotal);
        System.out.println("Tax: $"+tax);
        
        System.out.println("Final total: $"+(stotal+tax));
	}
}