package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot joe=new Robot();
		
		
joe.penDown();
        joe.setSpeed(10);

		
         for(int i=0; i<75; i++){
			
	joe.setRandomPenColor();
			
        	 joe.move(5*i);
        
	
			
		joe.turn(360/7);
	
			
	
			joe.setPenWidth(i);
         }
	}
}
