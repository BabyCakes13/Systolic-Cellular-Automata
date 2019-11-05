package celular_items;

import celular_items.CellularAutomaton;

public class Main {
	public static void main(String[] args) {
		CellularAutomaton ca = new CellularAutomaton(200, 100);
		ca.runGenerations();
	}
}
