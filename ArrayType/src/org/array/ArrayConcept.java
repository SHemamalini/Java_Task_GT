package org.array;

public class ArrayConcept {
	public static void main(String[]args) {
	int [][]a=new int[2][2];
	a[0][0]=1;
	a[0][1]=2;
	a[1][0]=2;
	a[1][1]=1;
	//for loop
//	for (int i=0;i<a.length;i++) {
//		for (int j = 0; j < a[i].length; j++) {  
//            System.out.println(a[i][j]);
//		
//	}
//	}
	
	//for each(value based)
	for(int[] b:a) {
		for(int c:b) {
			System.out.println(c);
		}
	}

	}
	}


