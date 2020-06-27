package main.Java;

import com.sun.glass.ui.SystemClipboard;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		int a=0,b=1,c,d=10; 
		
//System.out.println(a+" "+b);
		for(int i=2;i<=d;++i) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
		
	}

}
