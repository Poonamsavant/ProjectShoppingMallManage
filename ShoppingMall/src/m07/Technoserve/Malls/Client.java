package m07.Technoserve.Malls;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import m07.Technoserve.Mall.entity.Category;
import m07.Technoserve.Mall.entity.Customer;
import m07.Technoserve.Mall.service.CustomerService;
import m07.Technoserve.Mall.service.CustomerServiceImpl;

public class Client
{
	public static void main(String[] args) throws ParseException
	{
		//OrderDetails order= new OrderDetails();
		Customer customer = new Customer();
		CustomerService service = new CustomerServiceImpl();
		customer.setId(107);
		customer.setName("Nayana");
		customer.setEmail("poonams@gmail.com");
		customer.setPhone(8999602016L);
		customer.setCategory(Category.WHOLESALE);
		String dateString1="2-03-2022";
		String dateString2="2-05-2023";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");
		Date date1 =format.parse(dateString1);
		Date date2 = format.parse(dateString2);
		customer.setManufactring(date1);
		customer.setExpiry(date2);
		//service.addCustomer(customer);
		//service.updateCustomer(customer);
		System.out.println(customer);
		//service.deleteCustomer(105);
		service.searchCustomer(107);
	}
}
