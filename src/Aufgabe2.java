import javax.swing.*;

public class Aufgabe2 {

    public static void main(String[] args) {

            while(true){
                String eingabe = JOptionPane.showInputDialog("Bitte eine Zahl eingeben");
                if (isNumeric(eingabe)){ // Überprüft ob String numerisch ist
                    int zahl = Integer.parseInt(eingabe);
                }
                else break;
            }
        }
        private static boolean isNumeric(String eingabe) {
            try { // Innerhalb des try-Blockes wird die gewünschte Anweisung formuliert, die ggf. zu Fehlern führen kann.
                int zahl = Integer.parseInt(eingabe); // In den Fall wird jeweils eine spezielle Exception ausgelöst ("geworfen"), die innerhalb eines eigenen catch-Blockes abgefangen werden muss.
                return true;
            } catch (NumberFormatException ex) { // Stellt fest, dass in dem Fall, in dem keine Zahl in der Zeichenkette als Parameter übergeben wird, eine Ausnahme vom Typ NumberFormatException eintritt.
                return false;
            }
        }
    }

