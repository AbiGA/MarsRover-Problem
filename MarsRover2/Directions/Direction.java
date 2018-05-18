/*
   Direction.java
   MarsRover Problem
   Created by Abhishek on 5/18/2018.
*/

package Directions;

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
		public int move(int y) {
			// TODO Auto-generated method stub
			return y+1;
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
		   public int move(int x){
			return x+1;
			   
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
		public int move(int y) {
			// TODO Auto-generated method stub
			return y-1;
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
		public int move(int x) {
			// TODO Auto-generated method stub
			return x-1;
		}
		  };

		  public abstract Direction right();

		  public abstract Direction left();
		  
		  public abstract int move(int x);
		 }
