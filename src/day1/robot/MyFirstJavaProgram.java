package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot joe=new Robot();
		joe.setPenColor(80,70,40);
		joe.turn(360);
		joe.setPenWidth(30);
		joe.setWindowColor(255, 255, 0);
        
		
	}
}
