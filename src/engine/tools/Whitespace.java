package engine.tools;

/**
 * Given a String, removes all preceding and suffixing whitespace.
 * @author Matthew Page
 * @version 2.0
 */

public class Whitespace {
	
	/**
	 * @param input some string
	 * @return The same string with any whitespace at its beginning removed
	 */
	public static String remove(String input) {
		if (input.length() > 1 && input.substring(0,1).equals(" "))
			return Whitespace.remove(input.substring(1));
		else if (input.length() > 1 && input.substring(input.length() - 1).equals(" "))
			return Whitespace.remove(input.substring(0, input.length() - 1));
		else
			return input;
	}
	
}
