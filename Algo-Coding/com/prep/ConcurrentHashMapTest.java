package com.prep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	
	public static void main(String[] args) {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		
		Iterator<Integer> mapIterator = map.keySet().iterator();
		while(mapIterator.hasNext()) {
			if(mapIterator.next()==2)
				map.remove(2);
				
		}
		Set<Integer> keySet = map.keySet();
		for(Integer k : keySet) {
			System.out.println(k);
		}
		
	}
	
}
 