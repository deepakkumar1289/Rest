package com.deepak.springboot;

public class Account {
private int accno;
private double bal;
private String atype;

public Account() {

	System.out.println("Account-DC");
}

public Account(int accno, double bal, String atype) {
	super();
	this.accno = accno;
	this.bal = bal;
	this.atype = atype;
	System.out.println("Account-3 arg");
}

public Account(double bal, String atype) {
	super();
	this.bal = bal;
	this.atype = atype;
	System.out.println("Account-2 arg");
}

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public double getBal() {
	return bal;
}

public void setBal(double bal) {
	this.bal = bal;
}

public String getAtype() {
	return atype;
}

public void setAtype(String atype) {
	this.atype = atype;
}


}