package two_fighters_one_winner;

public class Fighter {
  public String name;
  public int health, damagePerAttack;

  public String getName() {
	  return name;
  }

  public void setName(String name) {
	  this.name = name;
  }
	
  public int getHealth() {
	  return health;
  }
	
  public void setHealth(int health) {
	  this.health = health;
  }

  public int getDamagePerAttack() {
	  return damagePerAttack;
  }	

  public void setDamagePerAttack(int damagePerAttack) {
	  this.damagePerAttack = damagePerAttack;
  }	
  
  public void receiveDamage(int damageReceived) {
	  this.health -= damageReceived;
  }	

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}
