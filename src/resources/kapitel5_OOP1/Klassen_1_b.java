package resources.kapitel5_OOP1;
/* Beispiel: Erstellen von Objekten innerhalb derselben Klasse
- Beachtet, dass wir in dem vorherigen Beispielen Objekte in einer anderen Klasse erstellt und auf die Elemente dieser Klasse zugegriffen haben.
- Jedoch können wir auch Objekte innerhalb derselben Klasse erstellen.
- Hier erstellen wir das Objekt innerhalb der main() Methode derselben Klasse.
*/

class Klassen_1_b {

    // speichert den Wert für das Licht
    // true, wenn das Licht eingeschaltet ist
    // false, wenn das Licht ausgeschaltet ist
    boolean istAn;

    // Methode zum Einschalten des Lichts
    void einschalten() {
        istAn = true;
        System.out.println("Licht an? " + istAn);
    }

    public static void main(String[] args) {

        // erstellt ein Objekt der Klasse Lampe
        Klassen_1_b led = new Klassen_1_b();

        // greift auf die Methode mit dem Objekt zu
        led.einschalten();
    }
}

