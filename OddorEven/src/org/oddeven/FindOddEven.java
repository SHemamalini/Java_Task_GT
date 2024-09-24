package org.oddeven;

import java.util.Scanner;

public class FindOddEven {
 public static void main(String[] args) {
	 System.out.println("enter the number: ");
	 Scanner scan=new Scanner(System.in);
	 int i=scan.nextInt();
	 if(i%2==0) {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");
	 }
 }
}
