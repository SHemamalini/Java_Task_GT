package org.collection;

//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

import java.util.*;
import java.util.Map.Entry;
public class MapConcept {
public static void main(String[] args) {
	//key not allow the duplicates and values allow the duplicates.
	Map<String,Integer> m=new HashMap();
	m.put("CSK",9);
	m.put("RCP", 10);
	m.put("MI", 7);
	m.put("SRH", 8);
	m.put("RR",3);
	m.put("MI", null);
	System.out.println(m);

	
	//methods
	
	int size=m.size();
	System.out.println(size);
	
	m.remove("MI");
	System.out.println(m);
	
	m.put("DD",10);
	System.out.println(m);
	
	boolean contain=m.containsKey("SRH");
	System.out.println(contain);
	
	boolean contains=m.containsValue(3);
	System.out.println(m);
	
	Set<String> keyset=m.keySet();
	System.out.println(keyset);
	
	Collection<Integer> values=m.values();
	System.out.println(values);
	
	
	
	System.out.println("================================");
	Set<Map.Entry<String,Integer>> entryset=m.entrySet();
    for(Map.Entry<String,Integer>e:entryset) {
    	System.out.println(e);
    	String key=e.getKey();
    	int value=e.getValue();
    	System.out.println(key);
    	
    	System.out.println(value);
    }
    
    
    //key  allow only one null and value is allow n null 
    Map<String,Integer> m1=new LinkedHashMap();
	m1.put("CSK",9);
	m1.put("RCP", 10);
	m1.put("MI", 7);
	m1.put("SRH", 8);
	m1.put(null,3);
	m1.put("GT", null);
	System.out.println(m1);
	
	
	//key is ignore the null,value allow null
	Map<String,Integer> m2=new TreeMap();
	m2.put("CSK",9);
	m2.put("RCP", 10);
	m2.put("MI", 7);
	m2.put("SRH", 8);
	m2.put("RR",3);
	m2.put("GT", null);
	System.out.println(m2);
	
	
	//key and values both ignore the null
	Map<String,Integer> m3=new Hashtable();
	m3.put("CSK",9);
	m3.put("RCP", 10);
	m3.put("MI", 7);
	m3.put("SRH", 8);
	m3.put("RR",3);
	m3.put("GT", 2);
	System.out.println(m3);
	
	
}
}
