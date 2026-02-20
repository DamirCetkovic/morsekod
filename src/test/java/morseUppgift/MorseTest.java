package morseUppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseTest {

    @Test
    public void testReturnsMorseA() {
        MorseConverter converter = new MorseConverter();
        String expected = ".-";
        String actual = converter.convertToMorse("A");

        assertEquals(expected, actual);
    }

    @Test
    public void testReturnsBokstavW() {
        MorseConverter converter = new MorseConverter();
        String expected = "W";
        String actual = converter.convertToText(".--");

        assertEquals(expected, actual);
    }

    @Test
    public void testReturnsMorseLowercaseA() {
        MorseConverter converter = new MorseConverter();
        String expected = ".-";
        String actual = converter.convertToMorse("a");

        assertEquals(expected, actual);
    }

    @Test
    public void testInvalidCharacter() {
        MorseConverter converter = new MorseConverter();
        String actual = converter.convertToMorse("?");

        assertEquals("Tecknet '?' stöds inte", actual);
    }

    @Test
    public void testInvalidMorse() {
        MorseConverter converter = new MorseConverter();
        String actual = converter.convertToText("-------");

        assertEquals("Morsekoden '-------' är ogiltig", actual);
    }

    @Test
    public void testReturnsMorseForWord() {
        MorseConverter converter = new MorseConverter();
        String actual = converter.convertToMorse("SOS");

        assertEquals("... --- ...", actual);
    }

    @Test
    public void testReturnsWordsForMorse() {
        MorseConverter converter = new MorseConverter();
        String actual = converter.convertToText("... --- ...");

        assertEquals("SOS", actual);
    }
}


