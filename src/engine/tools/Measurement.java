package engine.tools;

/**
 * A list of common measurement units.
 * @author Matthew Page
 * @version 2.0
 */

public enum Measurement {

	mL("ml", "milliliter", "milliliters", 0.001),
	L("l", "liter", "liters", 1);
	
	private String spellingOne;
	private String spellingTwo;
	private String spellingThree;
	private double multiplier;
	
	Measurement(String spellingOne, String spellingTwo, 
			String spellingThree, double multiplier) {
		this.spellingOne = spellingOne;
		this.spellingTwo = spellingTwo;
		this.spellingThree = spellingThree;
		this.multiplier = multiplier;
	}
	
	public String spellingOne() {
		return this.spellingOne;
	}
	
	public String spellingTwo() {
		return this.spellingTwo;
	}
	
	public String spellingThree() {
		return this.spellingThree;
	}
	
	public double multiplier() {
		return this.multiplier;
	}

}
