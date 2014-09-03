package engine.findInfo;

import engine.tools.Measurement;

/**
 * Given an string with a measurement at the beginning, determine
 * which it is, and return the rest of the string
 * @author Matthew Page
 * @version 2.0
 */

public class FindMeasurement {
	
	private Measurement measurementType;
	private String remaining;
	
	public FindMeasurement(String input) throws Exception {
		this.remaining = input;
		Measurement[] list = Measurement.values();
		for (Measurement measurement : list) {
			if (measurement.spellingOne().equals(input.substring(0, measurement.spellingOne().length()))) {
				measurementType = measurement;
				remaining = remaining.substring(measurement.spellingOne().length());
			} else if (measurement.spellingTwo().equals(input.substring(0, measurement.spellingTwo().length()))) {
				measurementType = measurement;
				remaining = remaining.substring(measurement.spellingTwo().length());
			} else if (measurement.spellingThree().equals(input.substring(0, measurement.spellingThree().length()))) {
				measurementType = measurement;
				remaining = remaining.substring(measurement.spellingThree().length());
			}
		}
	}
	
	public Measurement getMeasurement() {
		return this.measurementType;
	}
	
	public String getRemaining() {
		return this.remaining;
	}
}
