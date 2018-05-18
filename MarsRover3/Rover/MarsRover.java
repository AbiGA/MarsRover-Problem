/*
   MarsRover.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

package Rover;
import java.util.HashMap;

import Directions.Direction;

public class MarsRover extends RoverFunctionality  {
	
    private	HashMap<Character, Runnable> map = new HashMap<Character, Runnable>();
	private int x = 0;
    private int y = 0;
    private Direction facing;
    
    public void buildHashMap(final MarsRover rover){
		map.put('L', new Runnable() { 
		    public void run() { rover.setFacing(rover.getFacing().left()); }
		});
		map.put('R', new Runnable() { 
		    public void run() { rover.setFacing(rover.getFacing().right()); }
		});
		map.put('M', new Runnable() { 
		    public void run() { rover.getFacing().move(rover); }
		});
    }
     public HashMap<Character, Runnable> getHashMap(){
    	 return map;
     }
    
    public void setPos(int x, int y, Direction facing) {
        this.setX(x);
        this.setY(y);
        this.setFacing(facing);
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
