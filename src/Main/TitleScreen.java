package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;
import Stage.*;

public class TitleScreen extends JPanel implements KeyListener{
	public static ArrayList<Stage> stages = new ArrayList<Stage>();
	public static int cursor=0;
	public static boolean selected=false;
	
	public TitleScreen() {
		setVisible(true);
		setSize(100,100);
		addKeyListener(this);
		TrainingPractice stage1 = new TrainingPractice();
		stages.add(stage1);
		AnEarlyMorningAmbush stage2 = new AnEarlyMorningAmbush();
		stages.add(stage2);
		PreparingForAnInvasion stage3 = new PreparingForAnInvasion();
		stages.add(stage3);
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, 500, 500);
		g.drawString("Select a Map:",30,50);
		int counter=0;
		for(Stage s:stages) {
			counter++;
			g.drawString(s.number + ". " + s.name, 50, 50+(20*counter));
			
		}
		g.setColor(Color.yellow);
		g.fillRect(30,40+((cursor+1)*20),10,10);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
