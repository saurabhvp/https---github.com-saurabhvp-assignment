package com.gsp.app.transactions.model;

import javax.persistence.*;


@Entity
@Table(name = "balancedata")

public class BalanceInfo {
	
	public BalanceInfo() {

    }
	
	private int id;
    private String actno;
    private String balancedue;
    private String balanceduedate;
    private String lastpymtamt;
    
    public BalanceInfo(String actno) {
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
	
	public String getActno() {
		return actno;
	}
	public void setActno(String actno) {
		this.actno = actno;
	}
	
	public String getBalancedue() {
		return balancedue;
	}
	public void setBalancedue(String balancedue) {
		this.balancedue = balancedue;
	}
	
	public String getLastpymtamt() {
		return lastpymtamt;
	}
	public void setLastpymtamt(String lastpymtamt) {
		this.lastpymtamt = lastpymtamt;
	}
	
	public String getBalanceduedate() {
		return balanceduedate;
	}
	public void setBalanceduedate(String balanceduedate) {
		this.balanceduedate = balanceduedate;
	}
}


