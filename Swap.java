import java.util.Scanner;
class Swap{
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter two nos");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println(a+"\t "+b);
	}
}