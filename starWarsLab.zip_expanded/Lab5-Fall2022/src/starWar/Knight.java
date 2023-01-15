package starWar;

public class Knight extends Jedi{

	private Padawan padawan;
	private final String forceAbilityName;

	public Knight(String name, int battlesEngaged, int health, int lightsaberDamage, String lightsaberColor, int credit,
			Padawan p) {
		super(name, battlesEngaged, health, lightsaberDamage, lightsaberColor, credit);
		this.padawan = p;
		this.forceAbilityName = "Force Heal";
	}

	public Padawan getPadawan() {
		return padawan;
	}

	public void setPadawan(Padawan padawan) {
		this.padawan = padawan;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}

	public void healPadawan() {
		if (this.getHealth() != 0 && this.getPadawan().getHealth() != 0) {
			this.getPadawan().setHealth(this.getPadawan().getHealth() + this.getForceHealAmount());
		}
	}

	@Override
	public String toString() {
		return "Knight " + super.toString();
	}
}
