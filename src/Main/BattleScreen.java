package Main;

import java.awt.Graphics;

import javax.swing.JPanel;

import Stage.Stage;

public class BattleScreen extends JPanel {
	public static boolean complete=false;
	public Stage stage;
	public int nameCounter = 0;
	public BattleScreen(Stage stage) {
		setSize(500,500);
		setVisible(true);
		this.stage=stage;
	}
	
	public void paint(Graphics g) {
		nameCounter++;
		if(nameCounter < 5000) {
			g.drawString(stage.name, 50, 50);
		} else {
			for(int i=0;i<=10;i++) {
				g.drawLine(0, i*40, 400, i*40);
			}
			for(int i=0;i<=10;i++) {
				g.drawLine(i*40, 0, i*40, 400);
			}
			for(int i=0;i<stage.map.length;i++) {
				for(int j=0;j<stage.map[i].length;j++) {
					g.drawString("hello",i*30+30,j*30+30);
				}
			}
		}
		
		
	}

}
