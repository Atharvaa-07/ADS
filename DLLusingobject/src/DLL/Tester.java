package DLL;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleLL customerlist=new DoubleLL();
		System.out.println("Add Customer Details: id,name,city,pincode,mobileno.");
		customerlist.addCustomers(new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
		customerlist.addCustomers(new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
		customerlist.addCustomers(new Customer(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
		System.out.println("Added");
		customerlist.Display();
		customerlist.sesrchByCustomerName(sc.next());
		//customerlist.Display();
	}
	


}
