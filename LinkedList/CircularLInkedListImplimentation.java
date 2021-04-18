package LinkedList;

public class CircularLInkedListImplimentation {

	public static void main(String[] args) {
		CircularLinkedList CirList=new CircularLinkedList();
		
		CirList.insertNode(10);
		CirList.insertNode(20);
		CirList.insertNode(30);
		CirList.insertNode(40);
		CirList.insertNode(50);
		
		System.out.println("************");
		CirList.displayCircularNode();

	}

}
