/*
 * 
 * @author Alain Fathalla
 *
 */

public class House {
	// Instance Variables
	private int numWindows;
	private String color;
	private int numDoors;
	private int numRooms;
	private double cost;
	
	// Constructors
	public House() {
		this.numWindows = 1;
		this.color      = "blue";
		this.numDoors   = 1;
		this.numRooms  = 2;
		this.cost       = 250000.00;
	}
	
	public House (int numWindows, String color, int numDoors, int numRooms, double cost) {
		this.numWindows = numWindows;
		this.color      = color;
		this.numDoors   = numDoors;
		this.numRooms   = numRooms;
		this.cost       = cost;
	}
	
	// Setters
	public void setNumWindows (int numWindows) {
		this.numWindows = numWindows;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setNumDoors (int numDoors) {
		this.numDoors = numDoors;
	}
	
	public void setNumRooms (int numRooms) {
		this.numRooms = numRooms;
	}
	
	public void setCost (double numcost) {
				this.cost = cost;
	}
	
	// Getters
	public int getNumWindows() {
		return this.numWindows;
	}

	public String getColor() {
		return this.color;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumRooms() {
		return this.numRooms;
	}
	
	public double getCost() {
		return this.cost;
	}
	
}