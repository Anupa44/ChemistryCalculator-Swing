package engine.findInfo.compounds;

import engine.tools.CompoundName;

/**
 * Checks to see if the compound is expressed by a name.
 * If so, return the associated compound's molar mass.
 * @author Matthew Page
 * @version 2.0
 */

public class CheckName {
	
	private double compoundMolarMass;
	
	CheckName(String input) throws Exception {
		FIND: {
			CompoundName[] names = CompoundName.values();
			for (CompoundName compound : names) {
				if (input.equals(compound.compoundName()) || input.equals(compound.commonName())) {
					compoundMolarMass = compound.mass();
					System.out.println(compoundMolarMass);
					break FIND;
				}
			}
			throw new Exception();
		}
	}
	
	public double getCompoundMolarMass() {
		return compoundMolarMass;
	}
	
}
