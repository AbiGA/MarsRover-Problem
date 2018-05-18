/*
   Parsing.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

package Parsing;

import Directions.Direction;
import Rover.MarsRover;

public class Parsing extends MarsRover {
	 public static void main(String args[]) throws Exception {
	        Parsing parse = new Parsing();
	 
	        parse.setPos(1, 2, Direction.NORTH); //set x=1, y=2 and facing = NORTH
	        parse.buildHashMap(parse);  //Mapping between commands and respective methods to be invoked (ex. for 'L' call left() and so on.)
	        parse.getMovement(parse,"LMLMLMLMM"); // parse commands
	        String newPosition = parse.printPos(parse); //get final Rover coordinates and direction
	        System.out.println(newPosition);  //display final Rover coordinates and direction
	        
	   
	        parse.setPos(3, 3, Direction.EAST); //set x=3, y=3 and facing = EAST 
	        parse.getMovement(parse,"MMRMMRMRRM"); // parse commands
	        newPosition = parse.printPos(parse); //get final Rover coordinates and direction
	        System.out.print(newPosition); //display final Rover coordinates and direction
	    }
}
