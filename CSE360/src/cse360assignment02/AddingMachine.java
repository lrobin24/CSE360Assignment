/*	Name: Luca Robins
 * 	Date: 10/7/2020
 * 	Class: CSE360
 * 	Assignment: Create an addingmachine program based off thge given template.
 */




package cse360assignment02;

public class AddingMachine {

	// Instantiate variables used throughout program.
	private int total;
	private String history;

	public AddingMachine() {
		//Instantiate running total and history of activity to 0.
		total = 0;
		history = "0";
	}

	//Used to return the current total.
	public int getTotal() {
		return total;
	}

	//Used to add the given int to the total. Updates the total and adds the action to the history string.
	public void add(int value) {
		total = total + value;
		String addHist = (" + " + value);
		history = history + addHist;
		;

	}

	//Used to subtract the given int from the total. Updates the total and adds the action to the history string.
	public void subtract(int value) {
		total = total - value;
		String subHist = (" - " + value);
		history = history + subHist;
		;
	}

	//Returns the entire history of actions that were done to the total. 
	public String toString() {
		return (history);
	}

	//Rests the total and history string to 0, effectively giving it a clean slate and deleting all previous actions.
	public void clear() {
		this.history = "0";
		this.total = 0;
	}
}