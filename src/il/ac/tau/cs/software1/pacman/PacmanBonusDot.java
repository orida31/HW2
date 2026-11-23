package il.ac.tau.cs.software1.pacman;

import il.ac.tau.cs.software1.components.*;

public class PacmanBonusDot extends PacmanBonus {

	public PacmanBonusDot(PacmanGridComponent initialPosition) {
		super(initialPosition);
		this.imageComponent = new ImageComponent("bonus-dot");
		this.bonusScore = 10;
	}

	@Override
	public float getWeight() {
		float Dot_Weight = 1.0f;
		return Dot_Weight;
	}

	@Override
	public float getPrice() {
		return 12.0f;
	}
}
