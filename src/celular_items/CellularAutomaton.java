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

	public ArrayList<Cell> createRandomGeneration() {
		Random randomNumber = new Random();
		ArrayList<Cell> population = new ArrayList<Cell>();

		for (int i = 0; i < this.length; i++) {
			population.add(new Cell(randomNumber.nextBoolean()));
		}

		return population;
	}
	
	public ArrayList<Cell> createBasicGeneration() {
		ArrayList<Cell> population = new ArrayList<Cell>();

		for (int i = 0; i < this.length; i++) {
			boolean state = false;
			if (i == this.length / 2) {
				state = true;
			}
			population.add(new Cell(state));
		}

		return population;
	}

	public void runGenerations() {
		ArrayList<Cell> generation = this.createBasicGeneration();
		
		for (int generationsIndex = 0; generationsIndex < this.generations; generationsIndex++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nGeneration " + generationsIndex);
			
			for(int cellIndex = 0; cellIndex < this.length; cellIndex++) {
				this.printCell((generation.get(cellIndex).getState()));
				boolean newState = this.checkState(generation, cellIndex);
				generation.get(cellIndex).setState(newState);
			}
		}
	}
	
	public void printCell(boolean status) {
		if (status) {
			System.out.print("0");
		} else {
			System.out.print(" ");
		}
	}
	
	public boolean checkState(ArrayList<Cell> generation, int cellIndex) {
		Cell leftNeighbour;
		Cell rightNeighbour;
		
		if (cellIndex == 0) {
			leftNeighbour = new Cell(false);
			rightNeighbour = generation.get(cellIndex + 1);
		} else if (cellIndex == generation.size() - 1) {
			leftNeighbour = generation.get(cellIndex - 1);
			rightNeighbour = new Cell(false);
		} else {
			leftNeighbour = generation.get(cellIndex - 1);
			rightNeighbour = generation.get(cellIndex + 1);
		}
		
		//System.out.println(leftNeighbour.getState() + "-" + rightNeighbour.getState());
		boolean newState = Cell.computeNewState(leftNeighbour, rightNeighbour);
		return newState;
	}
}
