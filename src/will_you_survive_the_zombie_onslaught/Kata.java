package will_you_survive_the_zombie_onslaught;

public class Kata {

	public static String zombieShootout(int zombies, int range, int ammo) {
		// your code goes here
		String returnPhrase = "";
		int ammoAvailable = ammo;
		int remainingZombies = zombies;
		double distanceFromYou = range;
		boolean outOfAmmo = false;
		boolean shotAllZombies = false;
		boolean reachedYou = false;
		
		if (ammoAvailable == 0) outOfAmmo = true;
		if (distanceFromYou == 0) reachedYou = true;
		if (remainingZombies == 0) shotAllZombies = true;
		
		while(ammoAvailable > 0 || remainingZombies > 0 || distanceFromYou > 0){
			remainingZombies--;
    		ammoAvailable--;
			if (remainingZombies > 0) {
    			distanceFromYou = distanceFromYou - 0.5;
	    		if (distanceFromYou <= 0) {
	    			reachedYou = true;
	    			break;
	    		}
    		}else{
    			shotAllZombies = true;
    			break;
    		}
			if (ammoAvailable == 0 && remainingZombies > 0) {
				outOfAmmo = true;
				break;
			}
		}
		
		if (shotAllZombies) {
			returnPhrase = "You shot all " + zombies + " zombies.";
		}
		if (outOfAmmo) {
			returnPhrase = "You shot " + (zombies - remainingZombies) + " zombies before being eaten: ran out of ammo.";
		} 
		if (reachedYou) {
			returnPhrase = "You shot " + (zombies - remainingZombies) + " zombies before being eaten: overwhelmed.";
		}
		
		return returnPhrase;
	}
}