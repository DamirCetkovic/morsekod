package morseUppgift;

import java.util.HashMap;

public class MorseConverter {
    // Kartor för att spara konverteringen mellan tecken
    private HashMap<String, String> toMorse = new HashMap<>();
    private HashMap<String, String> toText = new HashMap<>();

    // Konstruktor - fyller mappningarna när objektet skapas
    public MorseConverter() {
        toMorse.put("A", ".-");
        toMorse.put("B", "-...");
        toMorse.put("C", "-.-.");
        toMorse.put("D", "-..");
        toMorse.put("E", ".");
        toMorse.put("F", "..-.");
        toMorse.put("G", "--.");
        toMorse.put("H", "....");
        toMorse.put("I", "..");
        toMorse.put("J", ".---");
        toMorse.put("K", "-.-");
        toMorse.put("L", ".-..");
        toMorse.put("M", "--");
        toMorse.put("N", "-.");
        toMorse.put("O", "---");
        toMorse.put("P", ".--.");
        toMorse.put("Q", "--.-");
        toMorse.put("R", ".-.");
        toMorse.put("S", "...");
        toMorse.put("T", "-");
        toMorse.put("U", "..-");
        toMorse.put("V", "...-");
        toMorse.put("W", ".--");
        toMorse.put("X", "-..-");
        toMorse.put("Y", "-.--");
        toMorse.put("Z", "--..");
        toMorse.put(" ", ";"); //(använder ; som morse-kod för mellanslag)

        // Fyller i toText automatiskt genom att vända på toMorse
        for (String tecken : toMorse.keySet()) {
            String kod = toMorse.get(tecken);
            toText.put(kod, tecken);
        }
    }

    // Metod för att omvandla text till morse
    public String convertToMorse(String text) {
        if (text == null) {
            return null;
        }
        // Gör om till stora bokstäver och dela upp i tecken
        String[] teckenArray = text.toUpperCase().split("");
        String resultat = "";

        for (int i = 0; i < teckenArray.length; i++) {
            String tecken = teckenArray[i];
            char c = tecken.charAt(0);

            // Om tecknet inte finns (siffror, specialtecken) skriv fel
            if (!Character.isLetter(c) && c != ' ') {
                return "Tecknet '" + tecken + "' stöds inte";
            }

            String kod = toMorse.get(tecken);
            resultat += kod;

            // Lägg till ett mellanslag mellan morse-tecken (men inte efter sista)
            if (i < teckenArray.length - 1) {
                resultat += " ";
            }
        }
        return resultat;
    }

    // Metod för att omvandla morse till bokstav
    public String convertToText(String morseKod) {
        if (morseKod == null) {
            return null;
        }
        // Vi delar upp strängen vid varje mellanslag för att få loss varje tecken
        String[] kodArray = morseKod.split(" ");
        String resultat = "";

        for (String kod : kodArray) {
            String tecken = toText.get(kod);

            // Om morsekoden inte hittas i mappen, returnera ett felmeddelande
            if (tecken == null) {
                return "Morsekoden '" + kod + "' är ogiltig";
            }
            resultat += tecken;
        }
        return resultat;
    }
}