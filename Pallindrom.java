package Basic;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		System.out.println("Enter the String");

		Scanner in = new Scanner(System.in);

		String str = in.next();
		int i=0,flag=0;
		
			for(int j=str.length()-1;j>str.length()/2;j--) {
				if(str.charAt(i++)==str.charAt(j)) {
					continue;
				}else {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Given String is Pallindrome");
			else
				System.out.println("Given String is not Pallindrome");

		in.close();

	}

}
