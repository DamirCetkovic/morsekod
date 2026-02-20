package morseUppgift;

import java.util.Scanner;

public class MorseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseConverter converter = new MorseConverter();
        boolean running = true;

        System.out.println("Välkomna till Morse-konverteraren");

        while (running) {
            System.out.println("\nVälj ett alternativ:");
            System.out.println("1. Text till Morse");
            System.out.println("2. Morse till Text");
            System.out.println("3. Avsluta");

            String val = scanner.nextLine();

            if (val.equals("1")) {
                System.out.println("Skriv in text: ");
                String input = scanner.nextLine();
                System.out.println("Resultat: " + converter.convertToMorse(input));

            } else if (val.equals("2")) {
                System.out.print("Skriv in morse-kod: ");
                String input = scanner.nextLine();
                System.out.println("Resultat: " + converter.convertToText(input));

            } else if (val.equals("3")) {
                running = false;
                System.out.println("Programmet avslutas...");
            } else {
                System.out.println("Ogiltigt val, välj 1, 2 eller 3.");
            }


        }
        scanner.close();
    }
}
