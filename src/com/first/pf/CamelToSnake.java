package com.first.pf;

import java.util.Optional;
import java.util.stream.Stream;

public class CamelToSnake {

	/*
	 * Convert Camel to snake_case using Stream concepts
	 */
	public String getCamelToSnake(String string) {
		//Get stream of character integer codes, 
		//map it to StringBuilder containing chars
		Stream<StringBuilder> streamChar = string.chars().mapToObj((int c) -> {
			StringBuilder sb;
			if (Character.isLowerCase(c)) {
				//map to char if lowercase
				sb = new StringBuilder().append((char) c);
			} else {
				//map to _char if uppercase
				sb = new StringBuilder().append('_').append(Character.toLowerCase((char) c));
			}

			return sb;
		}

		);

		Optional<StringBuilder> sb = streamChar.reduce(StringBuilder::append);
		return sb.get().toString();

	}

	/*
	 * Convert Camel to snake_case using loop
	 */
	public String getCamelToSnakeBySB(String string) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<string.length();i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				sb.append(string.charAt(i));
			}else {
				sb.append('_').append(Character.toLowerCase(string.charAt(i)));
			}
		}
		return sb.toString();
	
    }
}
