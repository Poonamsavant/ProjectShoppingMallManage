package m07.Technoserve.Mall.service;

import java.util.List;

import m07.Technoserve.Mall.entity.Customer;

public interface CustomerService
{

	public void addCustomer(Customer c);

	public void updateCustomer(Customer c);

	public void deleteCustomer(long id);

	public void searchCustomer(long id);

	//public void deleteCustomer(long id);

	//public void deleteCustomer(long id);

}
