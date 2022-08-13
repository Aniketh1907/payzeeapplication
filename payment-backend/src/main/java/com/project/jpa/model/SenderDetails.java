package com.project.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="senderdetails")
public class SenderDetails {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private long customerId;
  @Column(name="accountHolderName")
  private String accountHolderName;
  @Column(name="balance")
  private long balance;
  @Column(name="od")
  private String od;
public long getCustomerId() {
	return customerId;
}

public SenderDetails() {
	
	// TODO Auto-generated constructor stub
}

public SenderDetails(long customerId, String accountHolderName, long balance, String od) {
	super();
	this.customerId = customerId;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	this.od = od;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public String getOd() {
	return od;
}
public void setOd(String od) {
	this.od = od;
}
  
}
