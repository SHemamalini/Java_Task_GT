package org.array;

public class OnedTwod {
    public static void main(String[] args) {
        int[][] a = new int[2][2]; 
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 2;
        a[1][1] = 1;

        for (int[] b : a) {
            for (int c : b) {
                System.out.println(c);
            }
        }
    }
}

