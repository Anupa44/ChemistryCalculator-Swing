package engine;

import engine.tools.*;

/**
 * Stores the values for the input as they are determined.
 * @author Matthew Page
 * @version 2.0
 */

public class InputInfo {

	private double volumeAmount;
	private Measurement measurementType;
	private double concentration;
	private double compoundMolarMass;
	
	public InputInfo() {
		return;
	}
	
	public void setVolumeAmount(double volumeAmount) {
		this.volumeAmount = volumeAmount;
	}
	
	public void setMeasurementType(Measurement measurementType) {
		this.measurementType = measurementType;
	}
	
	public void setConcentration(double concentration) {
		this.concentration = concentration;
	}
	
	public void setCompound(double compoundMolarMass) {
		this.compoundMolarMass = compoundMolarMass;
	}
	
	public double getVolumeAmount() {
		return this.volumeAmount;
	}
	
	public Measurement getMeasurementType() {
		return this.measurementType;
	}
	
	public double getConcentration() {
		return this.concentration;
	}
	
	public double getCompound() {
		return this.compoundMolarMass;
	}
}
