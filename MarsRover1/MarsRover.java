/*
   MarsRover.java
   Solution-1
   Created by Abhishek on 5/18/2018.
*/

//Simple Solution using if-else. Avoid using this type of code.

public class Mars_Rover {
    public static final int N = 1;
    public static final int E = 2;
    public static final int S = 3;
    public static final int W = 4;
    int x = 0;
    int y = 0;
    int facing = N;
    public Mars_Rover() {
    }
    public void setPos(int x, int y, int facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public void printPos() {
        char direction = 'N';
        if (facing == 1) {
        	direction = 'N';
        } else if (facing == 2) {
        	direction = 'E';
        } else if (facing == 3) {
        	direction = 'S';
        } else if (facing == 4) {
        	direction = 'W';
        }
        System.out.println(x  + " "+   y +   " " +  direction);
    }
    public void get_movement(String coordinates) {
        for (int i = 0; i < coordinates.length(); i++  ) {
            check_movement(coordinates.charAt(i));
        }
    }
    private void check_movement(char movement) {
        if (movement=='L') {
            turnLeft();
        } else if (movement == 'R') {
            turnRight();
        } else if (movement == 'M') {
            move();
        } else {
            throw new IllegalArgumentException(
                    "Please use proper format");
        }
    }
    private void move() {
        if (facing == N) {
            this.y++ ;
        } else if (facing == E) {
            this.x++  ;
        } else if (facing == S) {
            this.y--;
        } else if (facing == W) {
            this.x--;
        }
    }
    private void turnLeft() {
        facing = (facing - 1) < N ? W : facing - 1;
    }
    private void turnRight() {
        facing = (facing +  1) > W ? N : facing  + 1;
    }
    public static void main(String args[]) {
        Mars_Rover rover = new Mars_Rover();
        rover.setPos(1, 2, N);
        rover.get_movement("LMLMLMLMM");
        rover.printPos(); 
        rover.setPos(3, 3, E);
        rover.get_movement("MMRMMRMRRM");
        rover.printPos(); 
    }
}
