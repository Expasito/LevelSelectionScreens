package Stage;

import java.util.ArrayList;

public class TrainingPractice extends Stage{
	public TrainingPractice() {
		int[][] mappo
		= {
				{1,1},
				{1,1},
				{1,1},
		};
		this.map=mappo;
		this.number=1;
		this.name="Training Practice";
		this.entities= new ArrayList<String>();
		this.entities.add("Armored Knight");
		this.entities.add("Soldier");
		this.entities.add("Archer");
	}

}
