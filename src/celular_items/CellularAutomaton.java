package celular_items;

import java.util.ArrayList;
import java.util.Random;

public class CellularAutomaton {
	private int length;
	private int generations;

	public CellularAutomaton(int length, int generations) {
		this.length = length;
		this.generations = generations;
	}

	public ArrayList<Cell> createFirstRandomGeneration() {
		Random randomNumber = new Random();
		ArrayList<Cell> population = new ArrayList<Cell>();

		for (int i = 0; i < this.length; i++) {
			population.add(new Cell(randomNumber.nextBoolean()));
		}

		return population;
	}

	public void runGenerations() {
		ArrayList<Cell> randomFirstGenerationCells = this.createFirstRandomGeneration();
		
		for (int generationsIndex = 0; generationsIndex < this.generations; generationsIndex++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Starting generation " + generationsIndex);
			for(int cellIndex = 0; cellIndex < this.length; cellIndex++) {
				System.out.println(randomFirstGenerationCells.get(cellIndex));
			}
		}
	}
}
