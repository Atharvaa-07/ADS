package DLL;

public class DoubleLL {
	private Customer head;
	private Customer tail;
	public DoubleLL() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
	}
	public void addCustomers(Customer customer) {
		if(head==null)//if list is empty
		{
			head=customer;
			tail=customer;
		}else {
			customer.setPrev(tail);
			tail.setNext(customer);
			tail=customer;
		}
		
	}
	public void Display() {
		Customer current= head;
		while(current!=null) {
			System.out.println(current.toString());
			current=current.getNext();
		}
	}
	public Customer sesrchByCustomerName(String name) {
		Customer current= head;
		while(current!=null) {
			if(current.getCustomer_name().equals(name)) {
				System.out.println(current.toString());
				return current;
			}
			current=current.getNext();
		}
		
		return current;
	}
	

}
