package Basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter the Number");

		Scanner in = new Scanner(System.in);
		int flag = 0;
		int n = in.nextInt();
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println(n + " Number is prime");
		} else
			System.out.println(n + " Number is not prime");

		in.close();

	}

}
