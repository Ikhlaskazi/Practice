package main.Java;

public class FibonaciSeries_Recursion {
	
	public static void main(String args[]) {
		
		int count=10;
		
		System.out.println("The fibonaci is ");
		
		fibonaci(count-2);
		

}
	
	private static void fibonaci(int count) {
		int a=0,b=1,c=0;
		if(count>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		
			fibonaci(count-1); 
			
		}
		
	}

	
	
}
