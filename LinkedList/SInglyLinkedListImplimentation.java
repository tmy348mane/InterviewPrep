package LinkedList;

public class SInglyLinkedListImplimentation {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		list.insertNode(10);
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);
		list.insertNode(50);
		list.insertNode(60);
		list.insertNode(70);

		System.out.println("**********************");
		list.displayList();

		list.deleteNode(20);

		System.out.println("*********After Deletion*************");
		list.displayList();

		list.updateNode(4, 100);

		System.out.println("*********After Updation*************");
		list.displayList();

		list.updateNode(1, 90);

		System.out.println("*********After Updation*************");
		list.displayList();

	}

}
