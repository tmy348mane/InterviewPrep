package LinkedList;

public class DoublyLinkedList {

	doublyNode head;

	public boolean inertNode(int data) {

		if (head == null) {
			doublyNode newDoublyNode = new doublyNode(data);
			head = newDoublyNode;
			newDoublyNode.prev = head;
		} else {
			doublyNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			doublyNode newDoublyNode = new doublyNode(data);
			temp.next = newDoublyNode;
			newDoublyNode.prev = temp;
		}
		return true;
	}
	public boolean insertNodeAtMid(int data,int position) {
		
		doublyNode temp=head;
		int positionCounter=1;
		while(position !=positionCounter) {
			
			temp=temp.next;
			positionCounter++;
			
		}
		
		doublyNode newDoublyNode=new doublyNode(data);
		
		temp.prev.next=newDoublyNode;
		newDoublyNode.next=temp.next;
		temp.next.prev=newDoublyNode;
		newDoublyNode.prev=temp.prev;
		
		return true;
	}
	public boolean delelteDoublyNode(int data) {
		if(head ==null) {
			System.out.println("No Node for Delete");
			return false;
		}else{
			doublyNode tempForDelete=head;
			
			if(tempForDelete.data == data) {
				
				head=tempForDelete.next;
				tempForDelete.next.prev=null;
				return true;
			}
			
			while(data!=tempForDelete.data) {
				tempForDelete=tempForDelete.next;
			}
			
			tempForDelete.prev .next=tempForDelete.next;
			tempForDelete.next.prev=tempForDelete.prev;
			return true;
		}
		
	}

	public void displayDoublyList() {
		doublyNode tempForForward=head;

		while (tempForForward != null) {
	
			System.out.print(tempForForward.data +" ");
			tempForForward=tempForForward.next;
			
		}
		System.out.println("\n");
		
		
		System.out.println("*********Reverese Link List");
		doublyNode temp=head;

		while (temp.next != null) {
			temp=temp.next;
		}
		 doublyNode tempForReverse=temp;
		 
		 while (tempForReverse!= head) {
				
				System.out.print(tempForReverse.data +" ");
				tempForReverse=tempForReverse.prev;
				
			}
		System.out.println("\n");
		
		
		
	}

}
