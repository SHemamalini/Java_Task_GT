package org.base;

public class Employee extends Company {
	private void empId() {
	       System.out.println("EN34N9");
		}
		private void empName() {
			System.out.println("Hema");

		}
		public static void main(String[] args) {
			Employee e=new Employee();
			e.empId();
			e.empName();
			e.compID();
			e.compName();
			e.staffId();
		}
		}
//signle inheritance (extends company.)