package engine.findInfo;

/**
 * Given a string with a molarity unit at the beginning,
 * remove it and return the rest of the string
 * @author Matthew Page
 * @version 2.0
 */

public class RemoveWord {
	
	public static String remove(String input) {
		if (input.substring(0, 2).equals("m "))
			return input.substring(2);
		else if (input.substring(0, 6).equals("molar "))
			return input.substring(5 );
		else if (input.substring(0, 2).equals("of"))
			return input.substring(2);
		else
			return input;
	}
}
