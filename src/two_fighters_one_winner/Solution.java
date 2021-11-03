package two_fighters_one_winner;

public class Solution {

	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
		// Your code goes here. Have fun!
		String winner = "";
		int nextTurn = 0;
		
		if (fighter1.getName().equals(firstAttacker)) {
			nextTurn = 1;
		}else {
			nextTurn = 2;
		}
		
		while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
			
			switch (nextTurn) {
			case 1:
				fighter2.receiveDamage(fighter1.getDamagePerAttack());
				
				if (fighter2.getHealth() <= 0) {
					winner = fighter1.getName();
				} else {
					nextTurn = 2;
				}
				break;
			case 2:
				fighter1.receiveDamage(fighter2.getDamagePerAttack());
				
				if (fighter1.getHealth() <= 0) {
					winner = fighter2.getName();
				}else {
					nextTurn = 1;
				}
				break;
			}			
		}

		return winner;
	}
}
