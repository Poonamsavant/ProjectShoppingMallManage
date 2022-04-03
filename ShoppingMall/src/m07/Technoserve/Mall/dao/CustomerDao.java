package m07.Technoserve.Mall.dao;

import java.util.List;

import m07.Technoserve.Mall.entity.Customer;

public interface CustomerDao 
{
	public void addCustomer(Customer c);

	void startTransaction();
	
	void endTransaction();

	public void updateCustomer(Customer c);

	//public void deleteCustomer(long id);

	public void deleteCustomer(long id);

	public void searchCustomer(long id);

	//public List<Customer> searchCustomer(long id);

	//public void deleteCustomer(long id);


}
