/*
   MarsRover.java
   MarsRover Problem

   Created by Abhishek on 5/18/2018.
*/

package Rover;
import Directions.Direction;
import Directions.RoverFunctionality;

public class MarsRover extends RoverFunctionality {
	
	private int x = 0;
    private int y = 0;
    private Direction facing;
    
    public MarsRover() {
    }
    
    public void setPos(MarsRover rover, int x, int y, Direction facing) {
        rover.setX(x);
        rover.setY(y);
        rover.setFacing(facing);
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Direction getFacing() {
		return facing;
	}
    
	public void setFacing(Direction facing) {
		this.facing = facing;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
