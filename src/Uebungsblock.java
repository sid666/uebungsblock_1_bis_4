public class Uebungsblock {

	// Achtung: Zur Ausfuehrung des Programms muss das Uebungstools.jar
	// eingebundenwerden. Die Anleitung finden Sie in den Folien zu dieser
	// Uebung: https://github.com/nordakademie-einfuehrung-java/vorlesungsskript/blob/master/folien/Semester_03_Termin_05_Uebungsblock_01-04.ppt

	/**
	 * Die Mainmethode ermoeglicht den Aufruf der einzelnen Uebungen ueber einen Abfragedialog
	 */
	public static void main(String[] args) {

		boolean ende = false;
		while (!ende) {

			int nr = Eingabe.frageNachIntUeberDialog("Bitte Uebungsnr eingeben (1-7, 0 zum Beenden):");

			Zeichenfenster.zeigeZeichenfenster();
			Zeichenfenster.clearZeichenfenster();
			Zeichenfenster.setzeFarbeSchwarz();

			if (nr == 1) {
				uebung1();
			}
			if (nr == 2) {
				uebung2();
			}
			if (nr == 3) {
				uebung3();
			}
			if (nr == 4) {
				uebung4();
			}
			if (nr == 5) {
				uebung5();
			}
			if (nr == 6) {
				uebung6();
			}
			if (nr == 7) {
				uebung7();
			}
			if (nr == 0) {
				System.exit(0);
			}
		}

	}

	public static void uebung1() {
		// TODO Implementieren Sie die Uebung 1
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
	}

	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}

}
