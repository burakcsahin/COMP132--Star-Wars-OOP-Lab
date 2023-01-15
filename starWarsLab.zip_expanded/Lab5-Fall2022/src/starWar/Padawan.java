package starWar;

public class Padawan extends Jedi {

	private Knight knight;
	private final String forceAbilityName;

	public Padawan(String name, int battlesEngaged, int health, int lightsaberDamage,
			String lightsaberColor, int credit, Knight knight) {
		super(name, battlesEngaged, health, lightsaberDamage, lightsaberColor, credit);
		this.knight = knight;
		this.forceAbilityName = "Jedi Mind Trick";
	}

	public Knight getKnight() {
		return knight;
	}

	public void setKnight(Knight knight) {
		this.knight = knight;
	}

	public String getForceAbilityName() {
		return forceAbilityName;
	}

	public void confuseSith(Sith s) {
		if (s.getHealth() != 0) {
			s.setLightsaberDamage(s.getLightsaberDamage() * 0.8);
		}
	}

	public void healKnight() {
		if (this.getHealth() != 0 && this.getKnight().getHealth() != 0) {
			this.getKnight().setHealth(this.getKnight().getHealth() + this.getForceHealAmount());
		}
	}

	@Override
	public String toString() {
		return "Padawan " + super.toString();
	}
}
