package day3;

import javax.swing.JOptionPane;

public class Complimenter {
public static void main(String[] args) {
	String compliment=", you look nice today! :)";
	String name=JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, name+ compliment);
}
}
