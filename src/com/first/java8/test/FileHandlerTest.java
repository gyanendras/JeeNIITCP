package com.first.java8.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.first.java8.FileHandler;

class FileHandlerTest {

	@Test
	void testFileDisplay() {
		FileHandler fh = new FileHandler();
		Stream<String> strStream;
		try(Stream<String> strStream1 = Files.lines(Paths.get("words.txt"))) {
			fh.displayStreamContent(strStream1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testCountWords() {
		FileHandler fh = new FileHandler();
		try(Stream<String> strStream1 = Files.lines(Paths.get("words.txt"))) {
			fh.countWords(strStream1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void testCountWordsOfOne() {
		FileHandler fh = new FileHandler();
		try(Stream<String> strStream1 = Stream.of("abc")) {
			fh.countWords(strStream1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
