package day5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import sun.applet.Main;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 800;
	final int frameHeight = 600;

	ScaryMaze() throws Exception {
		
		maze = ImageIO.read(getClass().getResource("maze.jpg"));
		
		 new Robot().mouseMove(150, 50);
		
		
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
	
        System.out.println(mouseColor);
		 
        int background=-256;
		if(mouseColor==background)
        scare();
		
		//10. if the mouse is on the end color
				
				// pop up a message to tell them they won
		int win=-16646171;
		if(mouseColor==win) {
		JOptionPane.showMessageDialog(null, "You Won! :D");
	}
	}
	private void scare() {
		System.out.println("BOO!");
		
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("369249__dinky-mixy__jumpscare-sound-fx.wav"));
		
		
			
	   sound.play();
		
	   showScaryImage("tumblr_mv4vkhO6ON1ssk8cyo1_1280.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Goat Scary Maze By Anthony");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



