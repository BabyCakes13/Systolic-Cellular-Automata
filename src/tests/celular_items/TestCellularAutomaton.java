package tests.celular_items;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import celular_items.Cell;
import celular_items.CellularAutomaton;
import tests.TestInterface;

public class TestCellularAutomaton implements TestInterface{
	
	@Test
	public void testCreateFirstRandomGeneration() {
		CellularAutomaton cellularAutomaton = new CellularAutomaton(cellularAutomatonLength, cellularAutomatonGenerations);
		ArrayList<Cell> randomGeneratedCells = cellularAutomaton.createRandomGeneration();
		
		Assert.assertEquals(cellularAutomatonLength, randomGeneratedCells.size());
	}
}
