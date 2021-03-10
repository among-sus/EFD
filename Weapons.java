package detroit;

public class Weapons {

	int damage;
	
	public double Bat() {
		damage = 5; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 11) {
			damage = 0;								// miss
		}
		else if (i < 16) {							// crit
			damage = (damage*2);
		}
		
		return damage;
		
	}
	public double Glock() {
		damage = 12; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 11) {
			damage = 0;								// miss
		}
		else if (i < 16) {							// crit
			damage = (damage*2);
		}
		
		return damage;
		
	}
	public double Uzi() {
		damage = 16; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 16) {
			damage = 0;								// miss
		}
		else if (i < 26) {							// crit
			damage = (damage*2);
		}
		
		return damage;
		
	}
	public double Thompson() {
		damage = 20; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 16) {
			damage = 0;								// miss
		}
		else if (i < 26) {							// crit
			damage = (damage*2);
		}	
		return damage;
	}
	public double M16() {
		damage = 30; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 21) {
			damage = 0;								// miss
		}
		else if (i < 41) {							// crit
			damage = (damage*2);
		}
		
		return damage;
		
	}
	public double fiftyCal() {
		damage = 20; 								// default damage
		int i;
		i = (int) (Math.random() * (100) + 1); 		// random from 1-100
		if (i < 26) {
			damage = 0;								// miss
		}
		else if (i < 76) {							// crit
			damage = 300;
		}
		
		return damage;
		
	}
}
