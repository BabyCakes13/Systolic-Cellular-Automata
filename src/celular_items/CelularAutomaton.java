package celular_items;

import java.util.Random;

public class CelularAutomaton {
	int length;
	
	public CelularAutomaton(int length) {
		this.length = length;
		
	}
	
	public boolean[] createFirstRandomGeneration() {
		Random randomNumber = new Random();
		boolean[] population = new boolean[length + 1];
		
		for(int i = 0; i < this.length; i++) {
			population[i] = randomNumber.nextBoolean();
		}
		
		return population;
	}
}
