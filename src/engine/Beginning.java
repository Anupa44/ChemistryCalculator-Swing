package engine;

/**
 * Begins the engin's analysis
 */
public class Beginning {
	public static double analyze(String input) throws Exception {
		return AnalyzeInput.controlAnalysis(input.toLowerCase());
	}
}
