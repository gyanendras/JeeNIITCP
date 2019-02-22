package com.mysystems;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class StringSortingByFreqTest {

	@Test
	void test() {
		StringSortingByFreq ssf = new StringSortingByFreq();
		List<Entry<Character, Integer>> l = ssf.sortByFrequency("Hello Worrrld");
		for(Entry<Character, Integer> ent:l) {
		System.out.println(ent.getKey());
		}
	}

}
