package engine.findInfo;

/**
 * Given a string with an Arabic number at the beginning,
 * determine what it is, and returning the remainder
 * of the string.
 * @author Matthew Page
 * @version 2.0
 */

public class FindNumber {
	
	private double number;
	private String remaining;
	
	public FindNumber(String input) {
		this.remaining = input;
		String numberString = "";
		while(remaining.substring(0, 1).equals("1") || 
				remaining.substring(0, 1).equals("2") || 
				remaining.substring(0, 1).equals("3") || 
				remaining.substring(0, 1).equals("4") || 
				remaining.substring(0, 1).equals("5") || 
				remaining.substring(0, 1).equals("6") || 
				remaining.substring(0, 1).equals("7") || 
				remaining.substring(0, 1).equals("8") || 
				remaining.substring(0, 1).equals("9") || 
				remaining.substring(0, 1).equals("0") || 
				remaining.substring(0, 1).equals(".")) {
			numberString += remaining.substring(0, 1);
			remaining = remaining.substring(1);
		}
		number = Double.parseDouble(numberString);
	}
	
	public double getNumber() {
		return this.number;
	}
	
	public String getRemaining() {
		return this.remaining;
	}
}
