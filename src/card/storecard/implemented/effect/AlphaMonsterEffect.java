package card.storecard.implemented.effect;

import java.util.ArrayList;

import card.storecard.StoreEffect;
import game.Phase;
import monster.Monster;

/**
 * Alpha Monster: Gain 1[Star] when you attack
 */
public class AlphaMonsterEffect extends StoreEffect {

	@Override
	public void checkTrigger(Monster monster, Phase phase, Monster attacker, ArrayList<Monster> monsters) {
		if (phase == Phase.ATTACKING) {
			trigger(monster, null, monsters);
		}
	}

	@Override
	protected void trigger(Monster monster, Monster attacker, ArrayList<Monster> monsters) {
		monster.incStars(1);
	}
}