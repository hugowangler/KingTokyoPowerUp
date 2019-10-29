package card.evolutioncard;

import card.Card;

public abstract class EvolCard implements Card<EvolEffect> {
	private String name;
	private int cost;
	private boolean temporary;
	private EvolEffect effect;
	private String description;

	public EvolCard(String name, int cost, boolean temporary, EvolEffect effect, String description) {
		this.name = name;
		this.cost = cost;
		this.temporary = temporary;
		this.effect = effect;
		this.description = description;
	}

	public EvolEffect getEffect() {
		return effect;
	}

	public String toString() {
		return name + ", Cost " + cost + ", " + (temporary ? "TEMPORARY" : "PERMANENT") + ", Effect " + description;
	}

	/**
	 * Returns the type of the evolution card. There are two types of cards, temporary and permanent.
	 * @return if the card is temporary or not
	 */
	public boolean isTeporary() {
		return temporary;
	}

	public int getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}
}