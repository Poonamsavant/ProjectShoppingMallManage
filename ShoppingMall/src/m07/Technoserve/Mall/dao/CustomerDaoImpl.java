package m07.Technoserve.Mall.dao;

import java.util.List;

import javax.persistence.EntityManager;

import m07.Technoserve.Mall.entity.Customer;


public class CustomerDaoImpl implements CustomerDao
{
	EntityManager cd;
	public CustomerDaoImpl()
	{
		cd = Configuration.createEntityManager();	
	}
	@Override
	public void addCustomer(Customer c)
	{
		 
	   	cd.persist(c);
		
	}
	@Override
	public void startTransaction() {
		cd.getTransaction().begin();
	}
	@Override
	public void endTransaction() {
		cd.getTransaction().commit();
	}
	@Override
	public void updateCustomer(Customer c) {
		cd.merge(c);
	}
	//@Override
	public void deleteCustomer(long id) {
		
		Customer c=cd.find(Customer.class,id);
		cd.remove(id);
	}
	@Override
	public void searchCustomer(long id) {
		Customer c= cd.find(Customer.class,id);
		//cd.Customer(id);
	}
	
}

