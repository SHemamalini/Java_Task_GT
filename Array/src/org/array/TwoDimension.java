package org.array;
import java.util.Scanner;

public class TwoDimension {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int rs =scan.nextInt();
	int cs=scan.nextInt();
	int a[][]=new int[rs][cs];
	for(int i=0;i<rs;i++) {
	for(int j=0;j<cs;j++) {
	a[i][j]=scan.nextInt();
	}
	}

	for(int i=0;i<rs;i++) {
	for(int j=0;j<cs;j++) {
	System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	int fd=0;
	for(int i=0;i<rs;i++) {
	for(int j=0;j<cs;j++) {
	if(i==j) {
	fd=fd+a[i][j];
	}
	}
	}
	System.out.println("FD = "+fd);
	int pd=0;
	for(int i=0;i<rs;i++) {
	for(int j=0;j<cs;j++) {
	if((i== cs-1-j)) {
	pd=pd+a[i][j];
	}
	}
	}
	System.out.println("PD = "+pd);


	}
	}
  
}
