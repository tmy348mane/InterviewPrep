package LinkedList;

public class CircularLinkedList {
	
	CircularNode head;
	
	public boolean insertNode(int data) {
		if(head==null) {
			CircularNode newCircularNode=new CircularNode(data);
			head=newCircularNode;
			newCircularNode.next=head;
		}else {
			CircularNode temp=head;
			
			while(temp.next!=head) {
				temp=temp.next;
			}
			CircularNode newCircularNode=new CircularNode(data);
			temp.next=newCircularNode;
			newCircularNode.next=head;
		}
		
		return true;
	}
	
	public void displayCircularNode() {
		CircularNode tempForTraversal=head;
		
		
		do{
			System.out.print(tempForTraversal.data+" ");
			tempForTraversal=tempForTraversal.next;
		}while(tempForTraversal!=head);
		System.out.println("\n");
	}

}
