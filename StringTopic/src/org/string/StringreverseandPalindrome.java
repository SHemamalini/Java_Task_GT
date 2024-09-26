package org.string;

public class StringreverseandPalindrome {
public static void main(String[] args) {
	String s="Hemamalini";
	String a="";
	int length=a.length();
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i));
		a=a+s.charAt(i);
	}
	if(s.equals(a))
	{
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
