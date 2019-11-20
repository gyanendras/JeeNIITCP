package com.first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.first.pf.CamelToSnake;

class TestCamelToSnake {

	@Test
	void testCamelToSnake() {
		CamelToSnake cts = new CamelToSnake();
		assertEquals("my_name_is_camel", cts.getCamelToSnake("myNameIsCamel"));

	}

	@Test
	void testGetCamelToSnakeBySB() {
		CamelToSnake cts = new CamelToSnake();
		assertEquals("my_name_is_camel", cts.getCamelToSnakeBySB("myNameIsCamel"));
	}
}
