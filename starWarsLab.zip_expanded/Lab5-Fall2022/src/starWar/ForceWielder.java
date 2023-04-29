package starWar;


public abstract class ForceWielder {
	private String name;
	protected int battlesEngaged;
	protected double health;
	protected double lightsaberDamage;

	public ForceWielder(String name, int battlesEngaged, int health, int lightsaberDamage) {
		this.name = name;
		this.battlesEngaged = battlesEngaged;
		this.health = health;
		this.lightsaberDamage = lightsaberDamage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBattlesEngaged() {
		return battlesEngaged;
	}

	public void setBattlesEngaged(int battlesEngaged) {
		this.battlesEngaged = battlesEngaged;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getLightsaberDamage() {
		return lightsaberDamage;
	}

	public void setLightsaberDamage(double d) {
		this.lightsaberDamage = d;
	}

	public abstract void totalCredits();

	@Override
	public String toString() {
		return "Name: " + name + " \n   Number of battles engaged: " + battlesEngaged + " \n   Health: " + health
				+ " \n   Damage of Lightsaber: " + lightsaberDamage +"\n";
	}

}
