package com.first.hackerank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArray {
	int spArr = 0;

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + spArr;
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SparseArray other = (SparseArray) obj;
		if (spArr != other.spArr)
			return false;
		return true;
	}

	// Complete the matchingStrings function below.
	public static int[] matchingStrings(String[] strings, String[] queries) {
		//Arrays.sort(strings);
		//Arrays.sort(queries);
		int p = 0;
		boolean found = true;
		Integer[] result = new Integer[queries.length] ;
		
		for (int j = 0; j < queries.length; j++) {
			for (int i = 0; i < strings.length; i++) {
				if (queries[j].equals(strings[i])) {
					//System.out.println(result.toString());
					result[j] = result[j]==null?1:result[j]+1;
					
				} 
			}
			result[j] = result[j]==null?0:result[j];
			
		}

		
		int[] anArray = Arrays.stream(result)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .toArray();
		//System.out.println(Arrays.toString(anArray));
		return anArray;

	}

	private static int ifNull(Map<String,Integer> result, String str) {
		return result.get(str)==null?0:result.get(str);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int stringsCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = scanner.nextLine();
			strings[i] = stringsItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = scanner.nextLine();
			queries[i] = queriesItem;
		}

		int[] res = matchingStrings(strings, queries);

		scanner.close();
	}
}
