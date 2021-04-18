package Basic;

import java.util.Scanner;

public class Factorial {

	public int fact(int n){
		if(n==0)
			return 1;
		
		return n=n*fact(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		Factorial fc=new Factorial();
		
		System.out.println(fc.fact(n));
		in.close();

	}

}
