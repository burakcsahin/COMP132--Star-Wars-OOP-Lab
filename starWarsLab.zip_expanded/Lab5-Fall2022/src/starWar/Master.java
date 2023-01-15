package starWar;

public class Master extends Sith implements HealthBoostable{

	private Apprentice apprentice;
	private final String forceAbilityName;

	public Master(String name, int battlesEngaged, int health, int lightsaberDamage, int credit,
			Apprentice apprentice) {
		super(name, battlesEngaged, health, lightsaberDamage, credit);
		this.apprentice = apprentice;
		this.forceAbilityName = "Force Lightning";
	}

	public Apprentice getApprentice() {
		return apprentice;
	}

	public void setApprentice(Apprentice apprentice) {
		this.apprentice = apprentice;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}

	public void shockJedi(Jedi j) {
		if (j.getHealth() != 0 && this.getHealth() != 0) {
			j.setHealth(j.getHealth() * 0.8);
			// first decreasing by %20, then decreasing by subtracting %50 of the saber
			// damage
			j.setHealth(j.getHealth() - (this.getLightsaberDamage() * 0.5));
		}
	}

	@Override
	public String toString() {
		return "Master " + super.toString();
	}

	@Override
	public void boostHealth() {
		this.setHealth(health * 2);
	}

}
