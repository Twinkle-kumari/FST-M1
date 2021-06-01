package Activities;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Activity1 {
	
	static ArrayList<String> List;

	@BeforeEach
	void setUp() throws Exception {
		// Initialize a new ArrayList
		List = new ArrayList<String>();

		// Add values to the list
		List.add("alpha"); // at index 0
		List.add("beta"); // at index 1
		
	}

	@Test
   void insertTest() {
		
		// Assert size of list
		assertEquals(2, List.size(), "Wrong size");
		
		List.add(2, "Charlie");

		// Assert with new elements
		assertEquals(3, List.size(), "Wrong element");
		
		//Assert individual Element
		assertEquals("alpha", List.get(0), "Wrong element");
		assertEquals("beta", List.get(1), "Wrong element");
		assertEquals("Charlie", List.get(2), "Wrong element");


	}
		
	
	
	@Test
	   void replaceTest() {
		
		// Replace element in ArrayList
		List.set(1, "Charlie");
		
		//Assert Size of the list
		assertEquals(2, List.size(), "Wrong size");


		// Assert individual elements
		assertEquals("alpha", List.get(0), "Wrong element");
		assertEquals("charlie", List.get(1), "Wrong element");
		
		
	}

}		
			
			
			

