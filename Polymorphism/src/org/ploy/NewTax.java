package org.ploy;

public class NewTax extends OldTax{
	//method overriding
		//same method,same arguments,different class
	public void taxLimit(int tax) {
		System.out.println("new tax limit is:"+tax);
		super.taxLimit(250000);
		this.taxLimit(2376);
	}
	public static void main(String[] args) {
		NewTax n=new NewTax();
		OldTax o=new OldTax();
	}
}
