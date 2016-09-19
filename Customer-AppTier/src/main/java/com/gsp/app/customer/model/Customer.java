package com.gsp.app.customer.model;

import javax.persistence.*;

@Entity
@Table(name = "CUSTDATA")
public class Customer {
	
	private int id;
    private String name;
    private String actno;
    private String address;
    private String phoneno;
    
    public Customer() {

    }

    public Customer(String actno) {
        this.actno = actno;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}


}
