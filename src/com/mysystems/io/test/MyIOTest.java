package com.mysystems.io.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.mysystems.io.MyIO;

class MyIOTest {

	@Test
	void testFileio() throws IOException {
		MyIO myio = new MyIO();
		myio.charFileIO();
	}

}
