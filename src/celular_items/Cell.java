package celular_items;

/**
 * Class which holds the blueprint of a cell.
 * 
 * @author babycakes
 */
public class Cell {
	private boolean state;

	/**
	 * Constructor of the {@link Cell} class.
	 * 
	 * @param state: boolean: The current state of the {@link Cell}.
	 * @author babycakes
	 */
	public Cell(boolean state) {
		this.state = state;
	}

	/**
	 * Return the state of the current {@link Cell}.
	 * 
	 * @return boolean: The state of the current {@link Cell}.
	 * @author babycakes
	 */
	public boolean state() {
		return this.state;
	}

	/**
	 * Method which computes the new state of the current {@link Cell} based on its
	 * left and right {@link Cell} neighbors.
	 * 
	 * @param leftNeighbour: {@link Cell}: The {@link Cell} found at the previous
	 *                       index in the array.
	 * @param rightNeighbour {@link Cell}: The {@link Cell} found at the next index
	 *                       in the array.
	 * @return boolean: The new state of the current {@link Cell}.
	 * @author babycakes
	 * 
	 */
	public static boolean computeNewState(Cell leftNeighbour, Cell rightNeighbour) {
		if (leftNeighbour.state() == rightNeighbour.state()) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Pretty print the Cell.
	 * 
	 * @author babycakes
	 */
	@Override
	public String toString() {
		return "Cell " + state;
	}
}
