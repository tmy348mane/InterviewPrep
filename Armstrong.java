package Basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	System.out.println("Enter the Number");
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int check=n;
		int temp=0;
		String nStr=String.valueOf(n);
		
		int armStrong=0;
		for(int i=0;i<nStr.length();i++) {
			temp=n%10;
			temp=(int)Math.pow(temp, nStr.length());
			
			armStrong=armStrong+temp;
			n=n/10;
		}
		if(armStrong== check) {
			System.out.println("Number is ArmStrong");
		}else
			System.out.println("Number is not ArmStrong");
		in.close();


	}

}
