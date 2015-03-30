package iut.tdd;

public class Convert extends HashTrip {

	public static String num2text(String input) {
		
		if (liste.containsKey(input)) {
			return liste.get(input);
		}
		
		int num = new Integer(Integer.parseInt(input));
		
		return null;

	}

	public static String text2num(String input) {

		return null;

	}

}