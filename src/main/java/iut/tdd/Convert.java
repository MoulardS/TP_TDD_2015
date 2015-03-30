package iut.tdd;

public class Convert extends HashTrip {

	static int a;

	static String centaine;
	
	static String exception;

	public static String num2text(String input) {

		if (liste.containsKey(input)) {
			return liste.get(input);
		}

		int num = new Integer(Integer.parseInt(input));

		if ((num < 100)) {

			if ((num > 69) && (num < 77)) {
				return "soixante-"+liste.get(Integer.toString(num-60));
			}
			
			if ((num > 89) && (num < 97)) {
				return "quatre-vingt-"+liste.get(Integer.toString(num-60));
			}

			return Convert.getDizaine(num) + "-" + Convert.getUnite(num);
		}

		if ((num > 100) && (num < 1000)) {
			
			return Convert.getCentaine(num) + Convert.getDizaine(num) + " "
					+ Convert.getUnite(num);
		}

		/*
		 * if (num > 100) { centaine = Convert.getCentaine(num); if
		 * (!Convert.getUnite(num).equals("zéro")) { centaine = centaine + "-";
		 * } }
		 * 
		 * if ((num > 16) && (num < 20)) { a = num - 10; return "dix-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 21) && (num < 30)) { a = num - 20; return "vingt-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 31) && (num < 40)) { a = num - 30; return "trente-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 41) && (num < 50)) { a = num - 40; return "quarante-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 51) && (num < 60)) { a = num - 50; return "cinquante-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 61) && (num < 70)) { a = num - 60; return "soixante-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 69) && (num < 80)) { a = num - 60; if ((a > 16) && (a <
		 * 20)) { a = a - 10; return "soixante-dix-" +
		 * liste.get(Integer.toString(a)); } return "soixante-" +
		 * liste.get(Integer.toString(a)); }
		 * 
		 * if ((num > 80) && (num < 100)) { a = num - 80; if ((a > 16) && (a <
		 * 20)) { a = a - 10; return "quatre-vingt-dix-" +
		 * liste.get(Integer.toString(a)); } return "quatre-vingt-" +
		 * liste.get(Integer.toString(a)); }
		 */

		return null;

	}

	public static String getUnite(int chiffre) {

		while (chiffre > 10) {
			chiffre = chiffre - 10;
		}
		return liste.get("" + chiffre);
	}

	public static String getDizaine(int chiffre) {

		if (chiffre < 10) {
			return null;
		}
		int cpt = 0;
		while (chiffre > 10) {
			chiffre = chiffre - 10;
			cpt++;
		}
		if (cpt == 7) {
			return "soixante-dix";
		}
		if (cpt == 9) {
			return "quatre-vingt-dix";
		}
		return liste.get("" + cpt * 10);
	}

	public static String getCentaine(int chiffre) {

		if (chiffre < 100) {
			return null;
		}
		int cpt = 0;
		while (chiffre > 100) {
			chiffre = chiffre - 100;
			cpt++;
		}
		return liste.get(Integer.toString(cpt)) + " cent";
	}

	public static String text2num(String input) {

		return null;

	}

}