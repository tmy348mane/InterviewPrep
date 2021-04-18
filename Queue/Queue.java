package Queue;

public class Queue {
	
	public int[] arrayForQueue = new int[10];
	public int top = 0;
	public int rear = -1;

	public boolean push(int data) {
		if (top == arrayForQueue.length - 1) {
			System.out.println("Queue is Overflow! ");
			return false;
		} else {
			arrayForQueue[++rear] = data;
			return true;
		}
	}

	public int pop() {
		if (top == 0 || top>rear) {
			System.out.println("Queue is empty! ");
			return -100000;
		}else
			return arrayForQueue[top++];
	}

	public void showStack() {
		for (int i = top; i <= rear; i++) {
			System.out.print(arrayForQueue[i] + " ");
		}
		System.out.println("\n");
	}

}
