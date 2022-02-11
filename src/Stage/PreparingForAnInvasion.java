package Stage;

import java.util.ArrayList;

public class PreparingForAnInvasion extends Stage {
	public PreparingForAnInvasion() {
		int[][] mappo
		= {
				{1,1},
				{1,1},
				{1,1},
		};
		this.map=mappo;
		this.number=3;
		this.name="Preparing For An Invasion";
		this.entities= new ArrayList<String>();
		this.entities.add("Solder");
		this.entities.add("Soldier");
		this.entities.add("Soldier");
		this.entities.add("Soldier");
		this.entities.add("Soldier");
		this.entities.add("Paladin");
		this.entities.add("Paladin");
		this.entities.add("Paladin");
		this.entities.add("Paladin");
		this.entities.add("Paladin");
		this.entities.add("Warrior");
		this.entities.add("Warrior");
		this.entities.add("Warrior");
	}

}
