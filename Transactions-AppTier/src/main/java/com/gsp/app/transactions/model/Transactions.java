package com.gsp.app.transactions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transdata")
public class Transactions {
	private int id;
    private String transname;
    private String actno;
    private String amount;
    private String transdate;
	
    public Transactions() {

    }
    
    public Transactions(String actno) {
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
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransname() {
		return transname;
	}
	public void setTransname(String transname) {
		this.transname = transname;
	}
	public String getActno() {
		return actno;
	}
	public void setActno(String actno) {
		this.actno = actno;
	}
}
