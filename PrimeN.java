package Basic;

import java.util.Scanner;

public class PrimeN {

	public static void main(String[] args) {
		System.out.println("Enter the Number");

		Scanner in = new Scanner(System.in);
		int flag = 0;
		int n = in.nextInt();
		
		for(int j=3;j<n;j++) {
			flag=0;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.print(j+" ");
			}

			
		}
		

	
		in.close();

	}

}
