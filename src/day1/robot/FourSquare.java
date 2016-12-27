package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot joe= new Robot();
	

	void go() {
		joe.setSpeed(1000000000);

joe.setPenWidth(500);

		

			joe.setPenColor(60, 80, 40);
			joe.setPenColor(20, 12, 90);
			joe.setPenColor(60, 50, 10);
			joe.setPenColor(80, 90,10);
			
			drawSquare();	
			
			

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		int length=200;
		for(int i=0; i<4;i++)
		joe.move(length);
		joe.turn(90);
		
        
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
