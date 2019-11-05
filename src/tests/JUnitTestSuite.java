package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.celular_items.TestCell;
import tests.celular_items.TestCellularAutomaton;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestCell.class, 
	TestCellularAutomaton.class })
public class JUnitTestSuite {

}
