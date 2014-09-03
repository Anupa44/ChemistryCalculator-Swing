package engine.findInfo.compounds;

/**
 * Given a string with a compound name in it, determine
 * its molar mass and return that number.
 * @author Matthew Page
 * @version 2.0
 */

public class FindCompound {
	
	private String remaining;
	private double compoundMolarMass;
	
	public FindCompound(String input) throws Exception {
		remaining = input;
		try {
			checkName();
		} catch (Exception ex) {
			checkSymbols();
		}
	}
	
	public void checkName() throws Exception {
		CheckName checkName = new CheckName(remaining);
		compoundMolarMass = checkName.getCompoundMolarMass();
	}
	
	public void checkSymbols() throws Exception {
		CheckSymbols checkSymbols = new CheckSymbols(remaining);
		compoundMolarMass = checkSymbols.getCompoundMolarMass();
	}
	
	public double getMass() {
		return compoundMolarMass;
	}
}
