package Basic;

import java.util.Scanner;

public class Parenthesis {

	public static void main(String[] args) {
		System.out.println("Enter the String");

		Scanner in = new Scanner(System.in);

		String str = in.next();
		char[] strArr = new char[str.length()];
		int count = -1, flag = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				strArr[i] = str.charAt(i);
				count++;
				continue;
			}
			char ch = str.charAt(i);

			switch (ch) {
			case '}':
				if (strArr[count] == '(' || strArr[count] == '[') {
					System.out.println("Inside Curly Brackets");
					flag = 1;
				}
				count--;
				break;
			case ']':
				if (strArr[count] == '{' || strArr[count] == '(') {
					System.out.println("Inside Square Brackets");
					flag = 1;
				}
				count--;
				break;
			case ')':
				if (strArr[count] == '{' || strArr[count] == '[') {
					System.out.println("Inside Round Brackets");
					flag = 1;
				}
				count--;
				break;

			}
		}
		if (flag == 0)
			System.out.println("Valid String");
		else
			System.out.println("Not Valid String");

		in.close();

	}

}
