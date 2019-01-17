import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String[] args) {

        String mail = JOptionPane.showInputDialog("Deine E-Mail?");
        try {
            checkEmail(mail); //Errors sind Fehler, die meist durch Fehlfunktionen der JVM ausgelöst werden, zum sofortigen Abbruch der Programmausführung führen und nicht abgefangen werden.
            System.out.println(mail);
        } catch (Exception ex){ //Exceptions (Ausnahmen) sind Fehler, die meist durch das Programm selbst (Konvertierungsprobleme, Typisierungsfehler etc.) oder unvorhergesehene Änderungen der Ausführungsbedingungen (Netzwerkabriss, Dateisystemfehler, etc.) ausgelöst werden können und gesichert abgefangen werden müssen. Hierzu dienen try-catch-Blöcke.
            System.out.println("falsche E-Mail");

        }
    }


    public static void checkEmail (String email) throws Exception{

        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);  // prüft email auf Validität Gültigkeit, Wirksam
        if (!m.find());{
            throw new Exception();
        }
    }
}


