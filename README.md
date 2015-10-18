# Übungsblock zu Kapitel 1 bis 4 ("Grafische Ausgabe")

## Übung 1

Testen Sie das Zeichenfenster, indem Sie
* 3 Punkte an verschiedenen Koordinaten setzen,
* mit Hilfe von 4 Linien ein Rechteck zeichnen und
* eine Ellipse zeichnen, die exakt in das Rechteck passt.

## Übung 2
![Screenshot Übung 2](/screenshots/uebung02.png)

* Abgebildet sind ca. 80 Linien.
* Die erste Linie beginnt bei 0|800 und geht bis 800|0.
* Jeder weitere Linienstartpunkt hat eine um 10 kleinere y-Koordinate.
* Jeder weitere Linienendpunkt hat eine um 10 kleinere x-Koordinate.

## Übung 3
![Screenshot Übung 3](/screenshots/uebung03.png)

* Abgebildet sind ca. 60 Kreise.
* Der erste Kreis hat den Mittelpunkt 200|400.
* Der erste Kreis hat den Durchmesser 100.
* Bei jedem weiteren Kreis liegt der Mittelpunkt 5 Bildpunkte weiter rechts.
* Jeder weitere Kreis hat einen um 5 Bildpunkte größeren Durchmesser.

## Übung 4
![Screenshot Übung 4](/screenshots/uebung04.png)

* Abgebildet sind ca. 60 Ellipsen.
* Alle haben denselben Mittelpunkt.
* Die erste Ellipse ist 800 Bildpunkte breit und 200 hoch.
* Die nächste Ellipse ist 10 Bildpunkte schmaler, dafür jedoch 10 Bildpunkte höher.
* Die letzte Ellipse ist 200 Bildpunkte breit und 800 hoch.

## Übung 5
![Screenshot Übung 5](/screenshots/uebung05.png)

* Abgebildet sind ca. 4 x 100 Linien.
* In der unten gezeigten Ecke (100 Linien) geht die erste  Linie von 0|0 bis 800|0.
* Bei jeder weiteren Linie sind die x-Koordinate des Startpunktes und die y-Koordinate des  Endpunktes um jeweils 8 erhöht.
* Die übrigen Ecken werden analog gebildet.

> ### Beispielhaft nur die rechte obere Ecke
![Tipp Übung 5](/screenshots/tipp05.png)

## Übung 6
![Screenshot Übung 6](/screenshots/uebung06.png)

* Abgebildet sind 640.000 einzelne Bildpunkte.
* Für jeden Bildpunkt wird seine Farbe individuell bestimmt:
  * Der Rot-Anteil der Farbe ist umso größer, je näher er am Punkt 250|270 liegt.
  * Der Grün-Anteil der Farbe ist umso größer, je näher er am Punkt 550|270 liegt.
  * Der Blau-Anteil der Farbe ist umso größer, je näher er am Punkt 400|530 liegt.
  * Beträgt die Entfernung 0 Bildpunkte, so beträgt der Farbanteil 100%.
  * Beträgt die Entfernung >800 Bildpunkte, so beträgt der Farbanteil 0%.

## Übung 7
![Screenshot Übung 7](/screenshots/uebung07.png)

* Wie Übung 6, jedoch mit folgendem Unterschied:
  * Beträgt die Entfernung <200 Bildpunkte, so beträgt der Farbanteil 100%.
  * Beträgt die Entfernung >400 Bildpunkte, so beträgt der Farbanteil 0%.
  * Dazwischen (Entfernung 200 bis 400 Bildpunkte) soll der Farbanteil von 100% auf 0% sinken.
