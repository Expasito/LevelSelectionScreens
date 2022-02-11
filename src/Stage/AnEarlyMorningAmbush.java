package Stage;


import java.util.ArrayList;

public class AnEarlyMorningAmbush extends Stage{
	public AnEarlyMorningAmbush() {
		int[][] mappo
		= {
				{1,1},
				{1,1},
				{1,1},
		};
		this.map=mappo;
		this.number=2;
		this.name="An Early Morning Ambush";
		this.entities= new ArrayList<String>();
		this.entities.add("Solder");
		this.entities.add("Assassin");
		this.entities.add("Paladin");
	}

}