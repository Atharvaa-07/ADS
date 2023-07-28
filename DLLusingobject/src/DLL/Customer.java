package DLL;

public class Customer {
	private int customer_id;
	private String customer_name;
	private String customer_city;
	private double customer_pincode;
	private double customer_mobileno;
	private Customer prev;
	private Customer next;
	
	
	
	public Customer(int customer_id, String customer_name, String customer_city, double customer_pincode,
			double customer_mobileno) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_city = customer_city;
		this.customer_pincode = customer_pincode;
		this.customer_mobileno = customer_mobileno;
		prev=null;
		next=null;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public double getCustomer_pincode() {
		return customer_pincode;
	}
	public void setCustomer_pincode(double customer_pincode) {
		this.customer_pincode = customer_pincode;
	}
	public double getCustomer_mobileno() {
		return customer_mobileno;
	}
	public void setCustomer_mobileno(double customer_mobileno) {
		this.customer_mobileno = customer_mobileno;
	}
	public Customer getPrev() {
		return prev;
	}
	public void setPrev(Customer prev) {
		this.prev = prev;
	}
	public Customer getNext() {
		return next;
	}
	public void setNext(Customer next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_city="
				+ customer_city + ", customer_pincode=" + customer_pincode + ", customer_mobileno=" + customer_mobileno
				+ "]";
	}
	
	
	
	
	

}
