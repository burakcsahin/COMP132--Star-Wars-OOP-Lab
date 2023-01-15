package starWar;

public class Jedi extends ForceWielder implements Healable, HealthBoostable {
	private final double forceHealAmount;
	private String lightsaberColor;
	private int credit;

	public Jedi(String name, int battlesEngaged, int health, int lightsaberDamage, String lightsaberColor, int credit) {
		super(name, battlesEngaged, health, lightsaberDamage);
		this.forceHealAmount = this.getLightsaberDamage() * 2;
		this.lightsaberColor = lightsaberColor;
		this.credit = credit;

	}

	public String getLightsaberColor() {
		return lightsaberColor;
	}

	public void setLightsaberColor(String lightsaberColor) {
		this.lightsaberColor = lightsaberColor;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getForceHealAmount() {
		return forceHealAmount;
	}

	public void saberFight(Sith s) {
		battlesEngaged += 1;

		if (s.getHealth() != 0) {
			System.out.println("The Jedi " + this.getName() + " produced a damage worth " + this.getLightsaberDamage()
					+ " against the Sith " + s.getName());
			s.setHealth(s.getHealth() - this.lightsaberDamage);
			s.setLightsaberDamage(s.getLightsaberDamage()-10);
			this.setLightsaberDamage(this.getLightsaberDamage()+10);
		} else if (this.getHealth() == 0) {
			System.out.println("The Jedi " + this.getName() + " been defated by " + s.getName());
		} else {
			System.out.println("The Sith " + s.getName() + " been defeated by " + this.getName());
		}
	}

	public void revealLightsaber() {
		if (this.getLightsaberColor().equals("blue")) {
			System.out.println("Color generated from the lightsaber is blue");
		} else if (this.getLightsaberColor().equals("green")) {
			System.out.println("Color generated from the lightsaber is green");
		} else if (this.getLightsaberColor().equals("purple")) {
			System.out.println("Color generated from the lightsaber is purple");
		} else {
			System.out.println("An Unknown color has been generated from the lightsaber.");
		}
	}

	@Override
	public void totalCredits() {
		this.setCredit(310);

		if (this.battlesEngaged != 0) {
			this.setCredit(this.getCredit() + (15 * this.battlesEngaged));
		}

	}

	@Override
	public void heal() {
		this.setHealth(this.getHealth()+150);

	}

	@Override
	public String toString() {
		return "Jedi " + super.toString();
	}

	@Override
	public void boostHealth() {
		this.setHealth(health * 5);

	}
}
