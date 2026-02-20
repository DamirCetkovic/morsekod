# Morsekonverterare - Laboration 1

Detta är ett enkelt Java-program som konverterar text till morsekod och morsekod tillbaka till vanlig text (A-Z). Projektet är utvecklat med fokus på **TDD (Test Driven Development)** och tydlig kodstruktur.

## Funktioner
* **Text till Morse:** Omvandlar bokstäver (A-Z) till morsekod.
* **Morse till Text:** Omvandlar morsekod tillbaka till läsbar text.
* **Felhantering:** Programmet känner igen och meddelar om användaren skriver in tecken som inte stöds.
* **Hantering av mellanslag:** Använder semikolon (;) för att separera ord i morsekod.

## Tekniker
* **Java:** Grundläggande logik och objektorientering.
* **JUnit 5:** Automatiska tester för att säkerställa att konverteringen fungerar korrekt.
* **HashMap:** Används för effektiv lagring och hämtning av morse-alfabetet.

## Hur man kör programmet
1. Kör klassen `MorseMain` för att starta konsolapplikationen.
2. Välj ett alternativ i menyn (1, 2 eller 3).
3. Följ instruktionerna på skärmen.

## Tester
För att köra testerna, högerklicka på mappen `test` och välj **Run 'All Tests'**. Alla tester ska vara gröna.
