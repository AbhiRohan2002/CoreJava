class ForDemo{

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++){

			if(i%3==0 || i%5==0){
                if(count%5==0)
                	System.out.println();

				System.out.print(i+" ");
				count++;
			}
		}

    System.out.println("\nThe count of multiple of 3 or 5:"+count);
	}
}