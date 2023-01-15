package starWar;

public class Sith extends ForceWielder implements Healable {

	private final String lightsaberColor;
	private int credit;

	public Sith(String name, int battlesEngaged, int health, int lightsaberDamage, int credit) {
		super(name, battlesEngaged, health, lightsaberDamage);
		this.lightsaberColor = "Red";
		this.credit = credit;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getLightsaberColor() {
		return lightsaberColor;
	}

	public void saberFight(Jedi j) {
		this.battlesEngaged += 1;

		if (j.getHealth() != 0) {
			System.out.println("The Sith " + this.getName() + " produced a damage worth " + this.getLightsaberDamage()
					+ " against the Jedi " + j.getName());
			j.setHealth(j.getHealth() - this.lightsaberDamage);
			j.setLightsaberDamage(j.getLightsaberDamage()-10);
			this.setLightsaberDamage(this.getLightsaberDamage()+10);
		} else if (this.getHealth() == 0) {
			System.out.println("The Sith " + this.getName() + " been defated by " + j.getName());
		} else {
			System.out.println("The Jedi " + j.getName() + " been defeated by " + this.getName());
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
		this.setHealth(this.getHealth()+100);

	}
}
