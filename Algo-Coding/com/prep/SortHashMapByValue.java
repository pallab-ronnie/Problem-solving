package com.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.List;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> testMap = new HashMap<>();
		testMap.put("One", 1);
		testMap.put("three", 3);
		testMap.put("two", 2);
		testMap.put("five", 5);
		testMap.put("four", 4);
		testMap.put("six", 6);
		
		List<Map.Entry<String, Integer>> mapList = new ArrayList<>(testMap.entrySet());
		//Collections.sort(mapList, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
		Collections.sort(mapList, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		for(Map.Entry<String, Integer> entry : mapList) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
