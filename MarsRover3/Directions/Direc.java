/*
   Direc.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

package Directions;

import Rover.MarsRover;

public interface Direc {
	public void North(MarsRover rover);
	public void South(MarsRover rover);
	public void East(MarsRover rover);
	public void West(MarsRover rover);  
}
