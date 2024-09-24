package org.sample;

import org.base.Company;

public class Master {
private void masterId() {
System.out.println("EITN4332");
}
private void masterName() {
System.out.println("Srimathi");
}
public static void main(String[] args) {
	Company c=new Company();
	c.compID();
	c.compName();
	
	Master m=new Master();
	m.masterId();
	m.masterName();
}
}
