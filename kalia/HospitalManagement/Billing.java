package com.kalia.hospitalManagemant_system;

public class Billing {
private int billId;
private double amount;
private int  Mathod;
private String billMathod;
protected Billing(int billId, double amount, int mathod) {
	super();
	this.billId = billId;
	this.amount = amount;
	Mathod = mathod;
	billMathod=billmathodd();
}
String billmathodd() {
	String bill=switch(Mathod) {
	case 1->("payment via cash");
	case 2->("paymant Through Upi");
	case 3->("paymant Through debit card/credit card");
	default -> throw new IllegalArgumentException("Unexpected value: " + Mathod);
	};
	return bill;
}
@Override
public String toString() {
	return "Billing [billId=" + billId + ", amount=" + amount + ", Mathod=" + Mathod + ", billMathod=" + billMathod
			+ "]";
}

}
