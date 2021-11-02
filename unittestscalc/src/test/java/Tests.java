import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests {
    @Test
    public void testConcat_validArgument_success() {
        final String original = "Test string ";
        final String argument = "valid";
        final String expected = "Test string valid";

        final String result = original.concat(argument);

        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testConcat_emptyString_originalString(){
        final String original = "Test string ";
        final String argument = "";
        final String result = original.concat(argument);
        Assertions.assertEquals(original, result);
    }

    @Test
    public void testConcat_nullArgument_throwsException() {
        final String original = "Test string ";
        assertThrows (NullPointerException.class, () ->
        { original.concat(null);
        });
    }
}