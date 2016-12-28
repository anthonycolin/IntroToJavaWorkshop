package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

	
	public static void main(String[] args) {
		
	
	
	
	String sentence= JOptionPane.showInputDialog("");
	
	
	speak(sentence);
	
	for(int i=0;i<10; i++);
	
	}
	

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
