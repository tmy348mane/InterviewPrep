package LinkedList;

public class SinglyLinkedList {

	node head;

	public boolean insertNode(int data) {
		if (head == null) {
			head = new node(data);
			return true;
		} else {
			node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new node(data);
		}
		return true;
	}
	
	public boolean updateNode(int nodeNumber ,int data) {
		node tempForUpdate=head;
		int nodeNumberCounter=1;
		while(nodeNumber!= nodeNumberCounter) {
			tempForUpdate=tempForUpdate.next;
			nodeNumberCounter++;
		}
		tempForUpdate.data=data;
		return true;
	}
	
	public boolean deleteNode(int data) {
		node tempForDelete=head;
		node prevForDelete=null;
		while(tempForDelete.data != data) {
			prevForDelete=tempForDelete;
			tempForDelete=tempForDelete.next;
		}
		prevForDelete.next=tempForDelete.next;
		return true;
	}
	
	public void displayList() {
		node tempForDisplay=head;
		while(tempForDisplay!=null) {
			System.out.print(tempForDisplay.data +" ");
			tempForDisplay=tempForDisplay.next;
		}
		System.out.println("\n");
	}

}
