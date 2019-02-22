package com.mysystems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringSortingByFreq {
	String s = "Hello World";

	List<Entry<Character, Integer>> sortByFrequency(String str) {
		char[] chrArr = str.toCharArray();
		Map<Character, Integer> m = convertToFreqMap(chrArr);
		Set<Entry<Character, Integer>> setEntry = m.entrySet();
		List<Entry<Character, Integer>> l = new ArrayList<Entry<Character, Integer>>(setEntry);
		Collections.sort(l, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		});
				
		return l ;

	}

	private Map<Character, Integer> convertToFreqMap(char[] chrArr) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : chrArr) {
			if (c != ' ') {
				if (hm.containsKey(c)) {
					hm.put(c, hm.get(c) + 1);
				} else {
					hm.put(c, 1);
				}
			}
		}
		return hm;

	}

}
