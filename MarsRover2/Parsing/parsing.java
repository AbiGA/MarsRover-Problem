/*
   Parsing.java
   MarsRover Problem

   Created by Abhishek on 5/18/2018.
*/

package Parsing;

import Directions.Direction;
import Rover.MarsRover;

public class Parsing extends MarsRover {
	 public static void main(String args[]) {
	        Parsing parse = new Parsing();
	        parse.setPos(parse,1, 2, Direction.NORTH);
	        parse.getMovement(parse,"LMLMLMLMM");
	        parse.printPos(parse); 
	        parse.setPos(parse,3, 3, Direction.EAST);
	        parse.getMovement(parse,"MMRMMRMRRM");
	        parse.printPos(parse); 
	    }
}
