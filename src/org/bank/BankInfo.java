package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
System.out.println("12%");
	}
	private void fixed() {
System.out.println("10%");
	}
public static void main(String[] args) {
	BankInfo BI=new BankInfo();
	BI.saving();
	BI.fixed();
	BI.deposit();
}
}
