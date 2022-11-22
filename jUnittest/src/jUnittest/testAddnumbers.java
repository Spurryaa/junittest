package jUnittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddnumbers {

	@Test
	void test() {
		junitFunctions add = new junitFunctions();
        int result = add.AddNumbers(100, 200);
        assertEquals(300, result); 
		
	}

}
