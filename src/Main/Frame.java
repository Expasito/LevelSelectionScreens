package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Frame extends JFrame implements KeyListener{
	
	public Frame() {
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='s') {
			if(TitleScreen.cursor<TitleScreen.stages.size()-1) {
				TitleScreen.cursor++;
			}
			

		}
		if(e.getKeyChar()=='w') {
			if(TitleScreen.cursor>0) {
				TitleScreen.cursor--;
			}
			

		}
		if(e.getKeyChar() == ' ') {
			TitleScreen.selected=true;
		}
		
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
