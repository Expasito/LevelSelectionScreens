package Main;

import java.awt.Graphics;

import javax.swing.JPanel;

import Stage.Stage;

public class BattleScreen extends JPanel {
	public static boolean complete=false;
	public Stage stage;
	public BattleScreen(Stage stage) {
		setSize(500,500);
		setVisible(true);
		this.stage=stage;
	}
	
	public void paint(Graphics g) {
		g.drawString(stage.name, 50, 50);
	}

}
