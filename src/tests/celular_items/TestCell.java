package tests.celular_items;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import celular_items.Cell;
import tests.TestInterface;

public class TestCell implements TestInterface{
	
	@Test
	public void testGetState() {
		for(boolean state : possibleStates) {
			Cell newCell = new Cell(state);
			Assert.assertEquals(state, newCell.getState());
		}
	}
	
	@Test
	public void testComputeNewState() {
		boolean[][] truthTable = createTruthTable();
		
		for(int row = 0; row < truthTable.length; row++) {
			Cell leftNeighbour = new Cell(truthTable[row][0]);
			Cell rightNeighbour = new Cell(truthTable[row][1]);
			boolean expectedStatus = truthTable[row][2];
			
			Assert.assertEquals(expectedStatus, Cell.computeNewState(leftNeighbour, rightNeighbour));
		}
	}
	
	@Test
	public void testToString() {
		for(boolean state : possibleStates) {
			Cell newCell = new Cell(state);
			
			Assert.assertEquals("Cell " + state, newCell.toString());
		}
	}
	
	private boolean[][] createTruthTable() {
		boolean[][] truthTable = {
				{true, true, false},
				{true, false, true},
				{false, true, true},
				{false, false, false}
		};
		return truthTable;
	}
	
	
}
