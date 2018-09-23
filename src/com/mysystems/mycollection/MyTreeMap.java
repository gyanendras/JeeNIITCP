package com.mysystems.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.mysystems.MyAnnotation;

@MyAnnotation
public class MyTreeMap {
	
	public void treeMapSorting() {
		Map<String,String> m = new TreeMap<>();
		m.put("Arun","Singh");
		m.put("Zrun","Singh");
		m.put("Drun","Singh");
		m.put("Yrun","Singh");
		m.put("Trun","Singh");
		
		Set<String> s = m.keySet();
		List<String> l = new ArrayList<>(s);
		//Collections.sort(l);
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
