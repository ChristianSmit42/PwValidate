import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    @DisplayName("Passwortlänge größer Mindestanforderung")
    public void pwValidWithLength(){
        // GIVEN
        String pw = "123abcdefG";

        // WHEN
        boolean result = Password.checkLength(pw);

        // THEN
        assertEquals(true,result);
    }
    @Test
    @DisplayName("Passwortlänge kleiner Mindestanforderung")
    public void pwInValidWithLength(){
        // GIVEN
        String pw = "12";

        // WHEN
        boolean result = Password.checkLength(pw);

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält Ziffer")
    public void pwValidWithNumber(){
        // GIVEN
        String pw = "abcdefG6";

        // WHEN
        boolean result = Password.checkForNumber(pw);

        // THEN
        assertEquals(true,result);
    }

    @Test
    @DisplayName("Passwort enthält keine Ziffer")
    public void pwInValidWithoutNumber(){
        // GIVEN
        String pw = "abcdefG";

        // WHEN
        boolean result = Password.checkForNumber(pw);

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält Groß- und Kleinschreibung")
    public void pwValidWithLowerUpperCase(){
        // GIVEN
        String pw = "abcDEF";

        // WHEN
        boolean result = Password.checkCase(pw);

        // THEN
        assertEquals(true,result);
    }

    @Test
    @DisplayName("Passwort enthält nur Kleinschreibung")
    public void pwInValidWithOnlyLowerCase(){
        // GIVEN
        String pw = "abcdef";

        // WHEN
        boolean result = Password.checkCase("pw");

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält nur Großschreibung")
    public void pwInValidWithOnlyUpperCase(){
        // GIVEN
        String pw = "ABCDEF";

        // WHEN
        boolean result = Password.checkCase("pw");

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält weder Groß- noch Kleinschreibung")
    public void pwInValidWithoutLowerUpperCase(){
        // GIVEN
        String pw = "123456";

        // WHEN
        boolean result = Password.checkCase("pw");

        // THEN
        assertEquals(false,result);
    }
}