package Stack;

public class Stack {

	public int[] arrayForStack = new int[10];
	public int top = -1;
	public int size = 0;

	public boolean push(int data) {
		if (top == arrayForStack.length - 1) {
			System.out.println("Stack is Overflow! ");
			return false;
		} else {
			arrayForStack[++top] = data;
			return true;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is empty! ");
			return -100000;
		} else
			return arrayForStack[top--];
	}

	public void showStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arrayForStack[i] + " ");
		}
		System.out.println("\n");
	}
}
