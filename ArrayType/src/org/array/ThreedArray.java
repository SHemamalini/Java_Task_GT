package org.array;

public class ThreedArray {
	public static void main(String[]args) {
		int [][][]a=new int[3][3][3];
		    a[0][0][0] = 1;
	        a[0][0][1] = 2;
	        a[0][1][0] = 3;
	        a[0][1][1] = 4;
	        
	        a[1][0][0] = 5;
	        a[1][0][1] = 6;
	        a[1][1][0] = 7;
	        a[1][1][1] = 8;

	        a[2][0][0] = 9;
	        a[2][0][1] = 10;
	        a[2][1][0] = 11;
	        a[2][1][1] = 12;
	        for (int i=0;i<a.length;i++) {
	    		for (int j = 0; j < a[i].length; j++) { 
	    			for (int k = 0; k < a[i][j].length; k++) {
	                System.out.println(a[i][j][k]);
	    		
	    	}
	    	}


}
}
}
