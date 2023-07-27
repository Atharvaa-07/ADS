package SingleLL;

public class LL {
	Node newNode;
	private Node head;
	
	
	//Create New Node
	
	public boolean createNode(int data) {
		if(newNode==null)
			return false;
		if(head==null) 
		{
			head=newNode;
			return true;
		}
			
		return false;
		
	}
	//Inserting newNode at end of list
	
	public boolean insertNodeAtEnd(int data) 
	{
		createNode(data);
		Node temp= head;
		while(temp.getNext()!=null) 
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	//Inserting newNode at 1st position
	public boolean insertNodeAtFirst(int data) {
		createNode(data);
		newNode.setNext(head);
		head=newNode;
		return true;
	}
	//Display using recursion 
	public void DisplayRec(Node head) {
		if(head!=null) {
			System.out.print(head.getData()+" ");
			DisplayRec(head.getNext());
		}System.out.println();
	}
	public void DisplayRec() {
		DisplayRec( head);
		System.out.println();
	}
	
	//insert at given position
	public boolean insertAtPos(int data, int pos) {
		createNode(data);
		Node prev=head;
		for(int i=1;i<pos-1;i++) {
			if(prev==null) 
			{
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	
	
	
	
	

}
