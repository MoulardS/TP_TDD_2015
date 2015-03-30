package iut.tdd;

public class Convert extends HashTrip {

	static int a;

	public static String num2text(String input) {

		if (liste.containsKey(input)) {
			return liste.get(input);
		}

		int num = new Integer(Integer.parseInt(input));

		if ((num > 16) && (num < 20)) {
			a = num - 10;
			return "dix-" + liste.get(Integer.toString(a));
		}

		if ((num > 21) && (num < 30)) {
			a = num - 20;
			return "vingt-" + liste.get(Integer.toString(a));
		}

		if ((num > 31) && (num < 40)) {
			a = num - 30;
			return "trente-" + liste.get(Integer.toString(a));
		}

		if ((num > 41) && (num < 50)) {
			a = num - 40;
			return "quarante-" + liste.get(Integer.toString(a));
		}

		if ((num > 51) && (num < 60)) {
			a = num - 50;
			return "cinquante-" + liste.get(Integer.toString(a));
		}

		if ((num > 61) && (num < 70)) {
			a = num - 60;
			return "soixante-" + liste.get(Integer.toString(a));
		}

		if ((num > 69) && (num < 80)) {
			a = num - 60;
			if ((a > 16) && (num < 20)) {
				a = num - 10;
				return "soixante-dix-" + liste.get(Integer.toString(a));
			}
			return "soixante-" + liste.get(Integer.toString(a));
		}
		
		if ((num > 80) && (num < 100)) {
			a = num - 80;
			if ((a > 16) && (num < 20)) {
				a = num - 10;
				return "quatre-vingt-dix-" + liste.get(Integer.toString(a));
			}
			return "quatre-vingt-" + liste.get(Integer.toString(a));
		}
		
		return null;

	}

	public static String text2num(String input) {

		return null;

	}

}