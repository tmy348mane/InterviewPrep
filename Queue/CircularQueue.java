package Queue;

public class CircularQueue {

	public int[] arrayForCircularQueue = new int[3];
	public int top = -1;
	public int rear = -1;

	public boolean push(int data) {
		if (top == 0 && rear == arrayForCircularQueue.length - 1) {
			System.out.println("Queue is Overflow! ");
			return false;
		} else if (rear == (top - 1) % (arrayForCircularQueue.length - 1)) {
			System.out.println("Inside Circular Overflow Condition");
			System.out.println("Queue is Overflow! ");
			return false;
		} else if (top != 0 && rear == arrayForCircularQueue.length - 1) {
			rear = (rear + 1) % arrayForCircularQueue.length;
			arrayForCircularQueue[rear] = data;
			return true;
		} else {
			if (rear == -1)
				top = 0;
			arrayForCircularQueue[++rear] = data;
			return true;
		}
	}

	public int pop() {
		if (top == -1 && rear == -1) {
			System.out.println("Queue is empty! ");
			return -100000;
		} else {
			System.out.println("Top : " + top);
			return arrayForCircularQueue[top++];
		}

	}

	//Display Logic is Incomplete
	public void showStack() {
		int i = top;
		do {
			System.out.print(arrayForCircularQueue[i] + " ");
//			if (i == arrayForCircularQueue.length - 1) {
//				i = 0;
//			} else
				i++;
		} while (i != rear);
		System.out.println("\n");

		System.out.println("****************");

		for (int j = 0; j <= arrayForCircularQueue.length-1; j++) {

			System.out.print(arrayForCircularQueue[j] + " ");
		}
		System.out.println("\n");

	}
}
