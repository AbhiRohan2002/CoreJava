class SwitchDemo{
	
	public static void main(String[] args) {
		
		String color=args[0];
         switch(color.toLowerCase()){

         case "red": System.out.println("Roses are red!!");
         	         break;
         case "green": System.out.println("earth is green!!");
         	         break;
         case "blue": System.out.println("Sea is blue!!");
         	         break;

         default: System.out.println("Please enter RGB colors only!");
         }
	}
}