package Queue;

public class queue {
	private int n;
	private int[] arr ;
	private int rear=-1,front=-1;
	
	public void enqueue(int data) {
		if(rear==(n-1)) {
			System.out.println("Overflow");
		}
		if(front==-1 && rear==-1) {
			front=0;
			rear=0;
			arr[rear]=data;
		}else {
			rear++;
			arr[rear]=data;
			
			
		}
	}
	public void dequeue() {
		if(front==-1 && rear==-1) {
			System.out.println("Underflow");
		}else {
			front++;
		}
	}
	public void display() {
		System.out.print("\nItems are : ");
		for(int i=front;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public void Search(int val) {
		int count=0;
		for(int i=front;i<=rear;i++) {
			if(arr[i]==val) {
				System.out.println("\nElement found at "+i+" position");
				
			}
			
		}
		
		
	}
	public queue(int n  ) {
		super();
		this.n = n;
		arr=new int[n];
		
		rear=-1;
		front=-1;
		
	}
	
	
	
	
}
