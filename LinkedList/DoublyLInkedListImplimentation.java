package LinkedList;

public class DoublyLInkedListImplimentation {

	public static void main(String[] args) {

		DoublyLinkedList DList = new DoublyLinkedList();

		DList.inertNode(10);
		DList.inertNode(20);
		DList.inertNode(30);
		DList.inertNode(40);
		DList.inertNode(50);

		System.out.println("*************");
		DList.displayDoublyList();
		
		DList.insertNodeAtMid(60, 3);
		
		System.out.println("*******After Insertion At Mid******");
		DList.displayDoublyList();

//		DList.delelteDoublyNode(30);
//
//		System.out.println("******After Deleting 30******");
//		DList.displayDoublyList();
//
//		DList.delelteDoublyNode(20);
//
//		System.out.println("*****After Deleting 20********");
//		DList.displayDoublyList();
//
//		DList.delelteDoublyNode(10);
//
//		System.out.println("*****After Deleting 10********");
//		DList.displayDoublyList();
	}

}
