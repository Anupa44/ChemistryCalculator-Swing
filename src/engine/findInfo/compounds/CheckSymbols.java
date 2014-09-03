package engine.findInfo.compounds;

import java.util.ArrayList;

import engine.findInfo.FindNumber;
import engine.tools.Element;

/**
 * Checks if the compound is expressed by symbols.
 * If so, return the associated compound's molar mass.
 * @author Matthew Page
 * @version 2.0
 */

public class CheckSymbols {

	private String remaining; // The remainder of the compound in string form
							  // to be analyzed
	private ArrayList<Element> compound = new ArrayList<Element>();
	private ArrayList<Element> parentheses; // When analysis is in a
											// parenthesis, this array
											// contains the elements to 
											// duplicate
	private double compoundMolarMass;
	Element lastElement; // The most recent element added to the compound,
						 // in case of a number subscript.
	
	// Governs the analysis of the string
	CheckSymbols(String input) throws Exception {
		this.remaining = input;
		this.remaining += " "; // So the program can analyze the final part of the
							   // string without throwing an error.
		boolean error = true;
		do {
			try {
				findNextItem();
			}
			catch(Exception ex) {
				if (0 == compound.size())
					throw new Exception();
				error = false;
			}
		} while (error);
	}
	
	private void findNextItem() throws Exception {
		if(remaining.substring(0, 1).equals("("))
			beginParentheses();
		else if (remaining.substring(0, 1).equals("1") ||
				remaining.substring(0, 1).equals("2") ||
				remaining.substring(0, 1).equals("3") ||
				remaining.substring(0, 1).equals("4") ||
				remaining.substring(0, 1).equals("5") ||
				remaining.substring(0, 1).equals("6") ||
				remaining.substring(0, 1).equals("7") ||
				remaining.substring(0, 1).equals("8") ||
				remaining.substring(0, 1).equals("9") ||
				remaining.substring(0, 1).equals("0"))
			useNumber();
		else
			findNextElement(compound);
	}

	private void useNumber() {
		FindNumber findNumber = new FindNumber(remaining);
		int number = (int)findNumber.getNumber() - 1;
		for (int i = 0; i < number; i++)
			compound.add(lastElement);
		remaining = findNumber.getRemaining();
	}

	/**
	 * @param reference A reference to the array list to add the element to.
	 * */
	private void findNextElement(ArrayList<Element> reference) throws Exception {
		Element[] list = Element.values();
		LOOP: {
			for (Element element : list) {
				if (element.toString().toLowerCase().equals(remaining.substring(0, 2))) {
					reference.add(element);
					remaining = remaining.substring(2);
					lastElement = element;
					break LOOP;
				} else if (element.toString().toLowerCase().equals(remaining.substring(0, 1))) {
					reference.add(element);
					remaining = remaining.substring(1);
					lastElement = element;
					break LOOP;
				}
			}
			throw new Exception();
		}
		
	}

	private void beginParentheses() throws Exception {
		remaining = remaining.substring(1);
		parentheses = new ArrayList<Element>();
		while (!remaining.substring(0, 1).equals(")")) {
			findNextElement(parentheses);
		}
		remaining = remaining.substring(1);
		int count = Integer.parseInt(remaining.substring(0, 1));
		for (int i = 0; i < count; i++) {
			for (Element element : parentheses)
				compound.add(element);
		}
		remaining = remaining.substring(1);
	}

	public double getCompoundMolarMass() {
		compoundMolarMass = 0;
		for (Element element : compound){
			compoundMolarMass += element.atomicMass();
		}
		return compoundMolarMass;
	}
	
}
