package m07.Technoserve.Mall.entity;

import java.util.Date;
import java.util.List;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Customer 
{
	@Id
	private long id;
	private String name;
	//private List<OrderDetails> orders;
	private long phone;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date Manufactring;
	private Date Expiry;
	private Category category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	public List<OrderDetails> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDetails> orders) {
		this.orders = orders;
	}*/
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getManufactring() {
		return Manufactring;
	}
	public void setManufactring(Date manufactring) {
		Manufactring = manufactring;
	}
	public Date getExpiry() {
		return Expiry;
	}
	public void setExpiry(Date expiry) {
		Expiry = expiry;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", Manufactring="
				+ Manufactring + ", Expiry=" + Expiry + ", category=" + category + "]";
	}
	
	
	
	
}
