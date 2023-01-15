package starWar;

public class Apprentice extends Sith {

	private double mastersStartingHealth;
	private Master master;
	private final String forceAbilityName;

	public Apprentice(String name, int battlesEngaged, int health, int lightsaberDamage, int credit, Master master) {
		super(name, battlesEngaged, health, lightsaberDamage, credit);
		this.master = master;
		mastersStartingHealth=master.getHealth();
		this.forceAbilityName = "Force Choke";
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}

	public void chokeJedi(Jedi j) {
		if (j.getHealth() != 0 && this.getHealth() != 0) {
			j.setHealth(j.getHealth() * 0.5);
			// first decreasing by %50 then decreasing by substracting saber damage
			j.setHealth(j.getHealth() - this.getLightsaberDamage());
		}
	}

	public void betrayMaster() {
		if (master.getHealth() < mastersStartingHealth * 0.1) {
			master.setHealth(0);
			this.setHealth(100);
		}
	}

	@Override
	public String toString() {
		return "Apprentice " + super.toString();
	}

}
