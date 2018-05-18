/*
   RoverFunctionality.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

package Rover;

public class RoverFunctionality {


//return the final coordinates and direction of Rover
public String printPos(final MarsRover rover) { 
	return rover.getX()+" "+rover.getY()+" "+rover.getFacing().toString().charAt(0);
}


public void getMovement(final MarsRover rover,String coordinates) throws ReflectiveOperationException {
	for (int i = 0; i < coordinates.length(); i++  ) {
    	checkMovement(rover,coordinates.charAt(i));
    }
}

private void checkMovement(MarsRover rover,char movement) {
	rover.getHashMap().get(movement).run();	
}

}
