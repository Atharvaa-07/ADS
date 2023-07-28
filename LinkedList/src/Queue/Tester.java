package Queue;

public class Tester {
	public static void main(String[] args) {
		queue Q1= new queue(9);
		Q1.dequeue();
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		Q1.enqueue(40);
		Q1.enqueue(50);
		Q1.enqueue(60);
		Q1.enqueue(70);
		Q1.enqueue(80);
		Q1.enqueue(90);
		
		Q1.display();
		Q1.dequeue();
		Q1.display();
		Q1.Search(30);
	}
	
	
	
	

}
