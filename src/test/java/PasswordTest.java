import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    @DisplayName("Passwortlänge größer Mindestanforderung")
    public void pwValidWithLength(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("123abcdefG");

        // WHEN
        boolean result = pw.validateLength();

        // THEN
        assertEquals(true,result);
    }
    @Test
    @DisplayName("Passwortlänge kleiner Mindestanforderung")
    public void pwInValidWithLength(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("12");

        // WHEN
        boolean result = pw.validateLength();

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält Ziffer")
    public void pwValidWithNumber(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("abcdefG6");

        // WHEN
        boolean result = pw.validateNumber();

        // THEN
        assertEquals(true,result);
    }

    @Test
    @DisplayName("Passwort enthält keine Ziffer")
    public void pwInValidWithoutNumber(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("abcdefG");

        // WHEN
        boolean result = pw.validateNumber();

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält Groß- und Kleinschreibung")
    public void pwValidWithLowerUpperCase(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("abcDEF");

        // WHEN
        boolean result = pw.validateCase();

        // THEN
        assertEquals(true,result);
    }

    @Test
    @DisplayName("Passwort enthält nur Kleinschreibung")
    public void pwInValidWithOnlyLowerCase(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("abcdef");
        // WHEN
        boolean result = pw.validateCase();

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält nur Großschreibung")
    public void pwInValidWithOnlyUpperCase(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("ABCDEF");

        // WHEN
        boolean result = pw.validateCase();

        // THEN
        assertEquals(false,result);
    }

    @Test
    @DisplayName("Passwort enthält weder Groß- noch Kleinschreibung")
    public void pwInValidWithoutLowerUpperCase(){
        // GIVEN
        Password pw = new Password();
        pw.setPassword("123456");

        // WHEN
        boolean result = pw.validateCase();

        // THEN
        assertEquals(false,result);
    }
}