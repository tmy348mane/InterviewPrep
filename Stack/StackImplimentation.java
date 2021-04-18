package Stack;

import java.util.Scanner;

public class StackImplimentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack newObj = new Stack();
		boolean choice = true;

		do {
			System.out.println("//******* STACK *******// \n 1 : Push \n 2 : Pop \n 3 : Show Stack \n 4 : Exit \n");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the data ");
				newObj.push(scan.nextInt());
				break;
			case 2:
				System.out.println("Poped element : " + newObj.pop());
				break;
			case 3:
				newObj.showStack();
				break;
			case 4:
				choice = false;
				break;
			}
		} while (choice);

		System.out.println("Programe is terminated");
		scan.close();

	}

}
