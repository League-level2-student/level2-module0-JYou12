package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	int i = 0;
	boolean raceFinished = false;

	//2. create an array of 5 robots.
	Robot[] roboArray = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int e = 0; e <= 4; e++) {
		roboArray[e] = new Robot();
		roboArray[e].setAngle(0);
		roboArray[e].setY(550);
		roboArray[e].setX(50 + (e*100));
		roboArray[e].setSpeed(10);
	}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(raceFinished == false) {
	for(i = 0; i<= 4; i++) {
		Random rand = new Random();
		roboArray[i].move(rand.nextInt(250)+50);
		
		if(roboArray[i].getY() <= 0) {
			raceFinished = true;
			break;
		}
	}
	}
	
	if(raceFinished == true) {
		Random rand = new Random();
		System.out.println(roboArray[i] + " has won!");
		roboArray[i].moveTo(550, 250);
		while(raceFinished == true) {
			roboArray[i].turn(rand.nextInt(360));
			roboArray[i].move(rand.nextInt(10));
			roboArray[i].setSpeed(100);
			roboArray[i].sparkle();
			
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
