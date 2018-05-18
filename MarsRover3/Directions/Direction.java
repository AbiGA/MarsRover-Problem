/*
   Direction.java
   Solution for MarsRover Problem using HashMaps and optimised code.
   Solution-3
   Created by Abhishek on 5/18/2018.
*/

package Directions;

import Rover.MarsRover;

public enum Direction{
	
          NORTH {
		   @Override
		   public Direction right() {
		    return EAST;
		   }
		   @Override
		   public Direction left() {
		    return WEST;
		   }
		   @Override
		public void move(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setY(rover.getY()+1);
		}
		@Override
		public void back(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setY(rover.getY()-1);
		}
		  },
		  
		  EAST {
		   @Override
		   public Direction right() {
		    return SOUTH;
		   }
		   @Override
		   public Direction left() {
		    return NORTH;
		   }
		   @Override
		   public void move(MarsRover rover){
			rover.setX(rover.getX()+1);
			   
		   }
		@Override
		public void back(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setX(rover.getX()-1);
		}
		  },

		  SOUTH {
		   @Override
		   public Direction right() {
		    return WEST;
		   }
		   @Override
		   public Direction left() {
		    return EAST;
		   }
		@Override
		public void move(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setY(rover.getY()-1);
		}
		@Override
		public void back(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setY(rover.getY()+1);
		}
		  },

		  WEST {
		   @Override
		   public Direction right() {
		    return NORTH;
		   }
		   @Override
		   public Direction left() {
		    return SOUTH;
		   }
		@Override
		public void move(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setX(rover.getX()-1);
		}
		@Override
		public void back(MarsRover rover) {
			// TODO Auto-generated method stub
			rover.setX(rover.getX()+1);
		}
		  };
		  
		  
		  public abstract Direction right();

		  public abstract Direction left();
		  
		  public abstract void back(MarsRover rover);
		  
		  public abstract void move(MarsRover rover);
		 }
