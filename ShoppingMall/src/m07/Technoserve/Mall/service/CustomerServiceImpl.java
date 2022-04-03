package m07.Technoserve.Mall.service;

import java.util.List;

import m07.Technoserve.Mall.dao.CustomerDao;
import m07.Technoserve.Mall.dao.CustomerDaoImpl;
import m07.Technoserve.Mall.entity.Customer;

public class CustomerServiceImpl implements CustomerService
{
	CustomerDao cd;
	public CustomerServiceImpl()
	{
		cd = new CustomerDaoImpl();
	}
	@Override
	public void addCustomer(Customer c) 
	{
		cd.startTransaction();
		cd.addCustomer(c);
		cd.endTransaction();
	}
	@Override
	public void updateCustomer(Customer c)
	{
		cd.startTransaction();
		cd.updateCustomer(c);
		cd.endTransaction();
		
	}
	@Override
	public void deleteCustomer(long id) {
		cd.startTransaction();
		cd.deleteCustomer(id);
		cd.endTransaction();
	}
	@Override
	public void searchCustomer(long id) 
	{
		
		
		
	}
	
	
}
