package Stack1;

public class tester {

	public static void main(String[] args) {
		
		Stack s=new Stack(5);
		s.push(4);
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(10);
		s.display();
		System.out.println(s.isFull());
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.pop();
		s.peek();
		s.display();
	}

}
