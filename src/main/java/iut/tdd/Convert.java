package iut.tdd;

import java.util.HashMap;

public class Convert {

	public static HashMap<String, String> liste = new HashMap<String, String>();
	static {
		liste.put("1", "un");
		liste.put("2", "deux");
		liste.put("3", "trois");
		liste.put("4", "quatre");
		liste.put("5", "cinq");
		liste.put("6", "six");
		liste.put("7", "sept");
		liste.put("8", "huit");
		liste.put("9", "neuf");
		liste.put("10", "dix");
		liste.put("11", "onze");
		liste.put("12", "douze");
		liste.put("13", "treize");
		liste.put("14", "quatorze");
		liste.put("15", "quinze");
		liste.put("16", "seize");
		liste.put("20", "vingt");
		liste.put("30", "trente");
		liste.put("40", "quarante");
		liste.put("50", "cinquante");
		liste.put("60", "soixante");
		liste.put("100", "cent");
		liste.put("1000", "mille");
	}

	public static String num2text(String input) {
		return "zéro";
	}

	public static String text2num(String input) {
		return null;
	}
}