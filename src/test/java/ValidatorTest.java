import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    @DisplayName("testest")
    public void pwValidWithLength(){
        // GIVEN
        String pw = "123abcdefG";

        // WHEN
        boolean result = Validator.validate(pw);

        // THEN
        assertEquals(true,result);

    }
}