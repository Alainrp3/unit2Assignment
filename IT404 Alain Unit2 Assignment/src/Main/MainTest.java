package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	

	@Test
	void testAdd() {
		
		int number1= 5;
		int number2= 4;
		int actualSum = Main.add(number1, number2);
		
		assertEquals(9, actualSum);
	}

}
