package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	
	boolean raceFinished = false;

	//2. create an array of 5 robots.
	Robot[] roboArray = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i <= 4; i++) {
		roboArray[i] = new Robot();
		roboArray[i].setAngle(0);
		roboArray[i].setY(550);
		roboArray[i].setX(50 + (i*100));
		roboArray[i].setSpeed(10);
	}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(raceFinished == false) {
	for(int i = 0; i<= 4; i++) {
		Random rand = new Random();
		roboArray[i].move(rand.nextInt(250)+50);
		
		if(roboArray[i].getY() <= 0) {
			raceFinished = true;
		}
	}
	}
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
