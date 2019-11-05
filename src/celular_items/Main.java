package celular_items;

public class Main {
	public static void main(String[] args) {
		CellularAutomaton ca = new CellularAutomaton(10, 2);
		System.out.println(ca.createRandomGeneration());
		ca.runGenerations();
	}
}
