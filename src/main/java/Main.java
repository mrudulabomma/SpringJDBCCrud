import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.business.DemoBean;
import com.stackroute.dto.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/applicationcontext.xml");
		DemoBean demo = (DemoBean) context.getBean("db");

		// Inserting Data into customer table

	//demo.insertCustomer(102, "chandra", "bangalore");

		// Selecting data from customer table
		Customer customer = demo.selectCustomer(102);
		System.out.println("Inserted Customer Name : " + customer.getCustomerName());

		// updating customer data in custoerm table
		Customer customer2 = new Customer();
		customer2.setCustomerId(101);
		customer2.setCustomerAddress("Vizag");
		customer2.setCustomerName("shekhar");

		demo.updateCustomer(customer2);

		// Deleting customer data from customer table

	 int count = demo.deleteCustomer(1);
	 System.out.println(count > 0 ? "Deleted Success" : "No Records found");

	}

}
