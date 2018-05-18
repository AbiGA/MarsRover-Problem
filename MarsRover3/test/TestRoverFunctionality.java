/*
   TestRoverFunctionality.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

//Unit test using Junit

package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Directions.Direction;
import Parsing.Parsing;

public class TestRoverFunctionality {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * This method tests the Rover Movement for the existing inputs
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 5 5
	 * 1 2 N
	 * LMLMLMLMM
	 * 
	 * Expected Output:
	 * 1 3 N
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testRoverMovementWithInputOne() throws Exception {
		Parsing parse = new Parsing();
        parse.setPos(1, 2, Direction.NORTH);
        parse.buildHashMap(parse);
        parse.getMovement(parse,"LMLMLMLMM");
        final String finalPosition = parse.printPos(parse);
        System.out.println(finalPosition);
        assertEquals(finalPosition,"1 3 N");
        
	}
	
	/**
	 * This method tests the Rover Movement for the existing inputs 
	 * 
	 * INPUT AND OUTPUT
	 * Test Input:
	 * 5 5
	 * 3 3 E
	 * MMRMMRMRRM
	 * 
	 * Expected Output:
	 * 5 1 E
	 * @throws Exception 
	 * 
	 */
	@Test
	public void testRoverMovementWithInputTwo() throws Exception {
		Parsing parse = new Parsing();
        parse.setPos(3, 3, Direction.EAST);
        parse.buildHashMap(parse);
        parse.getMovement(parse,"MMRMMRMRRM");
        final String finalPosition = parse.printPos(parse);
        System.out.println(finalPosition);
        assertEquals(finalPosition,"5 1 E");
	}

}
