package Main;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Frame frame = new Frame();
		TitleScreen title = new TitleScreen();
		
		frame.add(title);
		while(!TitleScreen.selected) {
			title.repaint();
		}
		frame.remove(title);
		BattleScreen battle = new BattleScreen(title.stages.get(TitleScreen.cursor));
		frame.add(battle);
		while(!battle.complete) {
			battle.repaint();
		}

	}

}
