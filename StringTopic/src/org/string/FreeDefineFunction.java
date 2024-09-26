package org.string;

public class FreeDefineFunction {
	public static void main(String[] args) {
		String a="java";
		
		char character=a.charAt(2);
		System.out.println(character);
		
		int index=a.indexOf(a);
		System.out.println(index);
		
		int lastindex=a.lastIndexOf(a);
		System.out.println(lastindex);
		
		int length=a.length();
		System.out.println(length);
		
		boolean empty=a.isEmpty();
		System.out.println(empty);
		
		boolean contain=a.contains("j");
		System.out.println(contain);
		
//		String trim=a.trim();
//		System.out.println(trim);
		
		boolean start=a.startsWith("ja");
		System.out.println(start);
		
		boolean end=a.endsWith("va");
		System.out.println(end);
		
		String upper=a.toUpperCase();
		System.out.println(upper);
		
		String lower=a.toLowerCase();
		System.out.println(lower);
		
		String f_name="hema";
		String l_name="Hema";
		
		boolean equals = f_name.equals(l_name);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = f_name.equalsIgnoreCase(l_name);
		System.out.println(equalsIgnoreCase);
		
		String b="Shree";
		String replace=b.replace("Shr","Shir");
		System.out.println(replace);
		
		String replaceAll = b.replaceAll("Sri","Shree");
		System.out.println(replaceAll);
		
		String substring=b.substring(3);
		System.out.println(substring);
		
		String substring2 = b.substring(1,3);
		System.out.println(substring2);
		
		int compare=b.compareTo("k");
		System.out.println(compare);
		
}
}
