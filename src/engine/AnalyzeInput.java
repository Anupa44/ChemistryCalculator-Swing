package engine;

import engine.findInfo.FindMeasurement;
import engine.findInfo.FindNumber;
import engine.findInfo.RemoveWord;
import engine.findInfo.compounds.FindCompound;
import engine.tools.Whitespace;

/**
 * Begins and controls the overall flow of the analysis of
 * the input.
 * @author Matthew Page
 * @version 2.0
 */

public class AnalyzeInput {
	
	private static String remainingToAnalyze;
	private static InputInfo information;
	
	public static void findVolumeAmount() {
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		remainingToAnalyze = RemoveWord.remove(remainingToAnalyze);
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		FindNumber volume = new FindNumber(remainingToAnalyze);
		information.setVolumeAmount(volume.getNumber());
		remainingToAnalyze = volume.getRemaining();
	}
	
	public static void findMeasurement() throws Exception {
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		remainingToAnalyze = RemoveWord.remove(remainingToAnalyze);
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		FindMeasurement measure = new FindMeasurement(remainingToAnalyze);
		information.setMeasurementType(measure.getMeasurement());
		remainingToAnalyze = measure.getRemaining();
	}
	
	public static void findConcentration() {
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		remainingToAnalyze = RemoveWord.remove(remainingToAnalyze);
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		FindNumber concentration = new FindNumber(remainingToAnalyze);
		information.setConcentration(concentration.getNumber());
		remainingToAnalyze = concentration.getRemaining();
	}
	
	public static void findCompoundMolarMass() throws Exception {
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		remainingToAnalyze = RemoveWord.remove(remainingToAnalyze);
		remainingToAnalyze = Whitespace.remove(remainingToAnalyze);
		FindCompound compound = new FindCompound(remainingToAnalyze);
		information.setCompound(compound.getMass());
	}
	
	public static double controlAnalysis(String input) throws Exception {
		remainingToAnalyze = input;
		information = new InputInfo();
		findVolumeAmount();
		findMeasurement();
		findConcentration();
		findCompoundMolarMass();
		findOutput();
		return findOutput();
	}
	
	public static double findOutput() {
		double output;
		output = information.getVolumeAmount() * 
				information.getMeasurementType().multiplier() *
				information.getConcentration() *
				information.getCompound();
		System.out.println(output);
		return output;
	}
	
}
