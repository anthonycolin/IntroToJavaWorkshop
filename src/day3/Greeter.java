package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String myName="Anthony";
	    String myyName= JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null,  "Hello, my name is "+ myName );
	}
	

}
