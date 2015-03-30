package iut.tdd;

public class Convert extends HashTrip {

	static int a;

	static String centaine;

	public static String num2text(String input) {

		if (liste.containsKey(input)) {
			return liste.get(input);
		}

		int num = new Integer(Integer.parseInt(input));

		if ((num < 100)) {

			if ((num > 69) && (num < 77)) {
				return "soixante-" + liste.get(Integer.toString(num - 60));
			}

			if ((num > 89) && (num < 97)) {
				return "quatre-vingt-" + liste.get(Integer.toString(num - 60));
			}

			return Convert.getDizaine(num) + "-" + Convert.getUnite(num);
		}

		if ((num > 100) && (num < 1000)) {

			if (Convert.getDizaine(num).equals("soixante-dix")) {

				return Convert.getCentaine(num)
						+ "-soixante-"
						+ liste.get(Integer.toString(num
								- Convert.getIntCentaine(num) * 100 - 60));
			} else if (Convert.getDizaine(num).equals("quatre-vingt-dix")) {
				return Convert.getCentaine(num)
						+ "-quatre-vingt-"
						+ liste.get(Integer.toString(num
								- Convert.getIntCentaine(num) * 100 - 80));
			} else {

				return Convert.getCentaine(num) + Convert.getDizaine(num) + "-"
						+ Convert.getUnite(num);
			}

		}

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
		while (chiffre > 100) {
			chiffre = chiffre - 100;
		}
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

	public static int getIntCentaine(int chiffre) {
		if (chiffre < 100) {
			return 0;
		}
		int cpt = 0;
		while (chiffre > 100) {
			chiffre = chiffre - 100;
			cpt++;
		}
		return cpt;
	}

	public static String getCentaine(int chiffre) {
		if (chiffre <200) {
			return "cent";
		}
		return liste.get(Integer.toString(Convert.getIntCentaine(chiffre)))
				+ " cent";
	}

	public static String text2num(String input) {

		return null;

	}

}