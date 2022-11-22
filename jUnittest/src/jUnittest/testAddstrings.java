package jUnittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddstrings {

	@Test
	void test() {
		junitFunctions junit = new junitFunctions();
        String result = junit.addStrings("Hello", "World");
        assertEquals("HelloWorld", result);
	}

}
