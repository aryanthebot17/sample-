package core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import core.Address;


@Component(value= "cust")

public class Customer {
	@Value("3456")
	private int code;
	@Value("sutherland")
	private String custName;

	 
	@Autowired
	private Address address;
	public int getCode() {
		return code;
	}
    
	public void setCode(int code) {
		this.code = code;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public void setAddress(Address a) {
		this.address=a;
	}
	
	public Address getAddress() {
		return this.address;
	}
	
	
	

}
