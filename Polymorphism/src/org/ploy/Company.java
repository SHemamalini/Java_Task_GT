package org.ploy;
//method overloading

	
//same class,same method,different arguments
//public class Company {
//private void empData(String name){
//	System.out.println("emp name is: "+name);
//}
//private void empData(int age) {
//		System.out.println("emp age is: "+age);
//
//	}
//
//}
//public static void main(String[] args) {
//	Company c=new Company();
//	c.empData("hema");
//	c.empData(20);
//	c.empData("sri");
//	c.empData(23);
//	
//}
	
	
	
	
//one method depend on the datatype count(one method more than one arguments)

//	private void empData(String name,int a){
//		System.out.println("emp name is: "+name +"\n" +"emp a is: "+a);
//	}
//	//private void empData(String n,int age)
//	private void empData(int age,String n) {
//			System.out.println("emp age is: "+age +"\n"+"emp n is: "+n);
//
//		}
//
//	public static void main(String[] args) {
//		Company c=new Company();
//		c.empData("hema",20);
//		c.empData(20,"priya");
//		c.empData("sri",20);
//		c.empData(23,"Anu");
//		
//	}



	
	
//	private void empData(String name){
//		System.out.println("emp name is: "+name );
//		this.empData(10);
//		this.empData('a');
//		
//	}
//	//private void empData(int age)
//	private void empData(int age) {
//			System.out.println("emp age is: "+age);
//			
//
//		}
//     private void empData(char a) {
//           System.out.println("emp age is:" +a);
//}
//	public static void main(String[] args) {
//		Company c=new Company();
//		c.empData("hema");
//		//c.empData(20);
//		c.empData("sri");
//		//c.empData(23);
//		
//	}




public class Company extends Employee{
	private void empData(String name){
		System.out.println("emp name is: "+name );
		this.empData(10);
		this.empData('a');
		super.empID("Hema");
		
	}
	private void empData(int age) {
			System.out.println("emp age is: "+age);
			

		}
     private void empData(char a) {
           System.out.println("emp age is:" +a);
}
	public static void main(String[] args) {
		Company c=new Company();
		Employee e=new Employee();
		c.empData("hema");
		c.empData("sri");
		
	}
	
	
	

}
