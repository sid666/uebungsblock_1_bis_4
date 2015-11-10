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
		
		//Horizontale
		Zeichenfenster.zeichneLinie(200, 200, 600, 200);
		Zeichenfenster.zeichneLinie(200, 500, 600, 500);
		//Vertikale
		Zeichenfenster.zeichneLinie(600, 200, 600, 500);
		Zeichenfenster.zeichneLinie(200, 200, 200, 500);
		
		
		Zeichenfenster.zeichnePunkt(400, 400);
		Zeichenfenster.zeichnePunkt(350, 300);
		Zeichenfenster.zeichnePunkt(450, 300);
		
		Zeichenfenster.zeichneEllipse(400, 350, 400, 300);
	}

	public static void uebung2() {
		// TODO Implementieren Sie die Uebung 2
		
		int t = 0;
		while ( t <= 800 ) {
			Zeichenfenster.zeichneLinie(0, 800-t, 800-t, 0);
		    t = t + 10;
		}

	}

	public static void uebung3() {
		// TODO Implementieren Sie die Uebung 3
		
		int d = 0;
		while ( d <= 300 ) {
			Zeichenfenster.zeichneEllipse(200+d, 400, 100+d, 100+d);
		    d = d + 5;
		}
	}

	public static void uebung4() {
		// TODO Implementieren Sie die Uebung 4
		int c = 0;
		while ( c <= 600 ) {
			Zeichenfenster.zeichneEllipse(400, 400, 800-c, 200+c);
		    c = c + 10;
		}
	}

	public static void uebung5() {
		// TODO Implementieren Sie die Uebung 5
		int x = 0;
		while ( x <= 3200 ) {
			Zeichenfenster.zeichneLinie(0+x, 0, 800, 0+x);
			Zeichenfenster.zeichneLinie(0, 0+x, 0+x, 800);
			
			Zeichenfenster.zeichneLinie(0+x, 800, 800, 800-x);
			Zeichenfenster.zeichneLinie(0, 800-x, 0+x, 0);
			
		    x = x + 8;
		  
		  /*  int x1 = 0;
			while ( x1 <= 3200 ) {
				Zeichenfenster.zeichneLinie(0+x1, 0, 800, 800+x1);
			    x1 = x1 + 8;    
			   
			    int x11 = 0;
				while ( x11 <= 3200 ) {
					Zeichenfenster.zeichneLinie(800+x11, 0, 800, 0+x11);
				    x11 = x11 + 8;
				    
				    int x111 = 0;
					while ( x111 <= 3200 ) {
						Zeichenfenster.zeichneLinie(800+x111, 0, 800, 800+x111);
					    x111 = x111 + 8;
					}
				}
			}*/
		}		
	}


	public static void uebung6() {
		// TODO Implementieren Sie die Uebung 6
	}

	public static void uebung7() {
		// TODO Implementieren Sie die Uebung 7
	}

}
