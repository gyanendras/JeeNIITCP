package com.first.java8;

import java.util.Optional;
import java.util.stream.Stream;

public class FileHandler {

	public void displayStreamContent(Stream<String> strStream) {
		strStream.forEach((x) -> System.out.println(x));
	}

	public void countWords(Stream<String> strStream) {
		//Optional<Long> num = strStream.map((x) -> (1L)).reduce(Math::addExact);
		Optional<Long> num = strStream.map((x) -> (1L)).reduce((y,z)->Math.addExact(y,z));
		num.ifPresent(System.out::println);

	}

}
