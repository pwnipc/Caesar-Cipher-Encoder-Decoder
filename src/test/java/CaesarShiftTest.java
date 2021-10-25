import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftTest {
    @Test
    public void caesarShift_convertCase_String() {
        CaesarShift testCase = new CaesarShift();
        assertEquals("Z", testCase.encrypt("a"));
    }

    @Test
    public void caesarShift_encryptSingleChar_String(){
        CaesarShift encryptChar = new CaesarShift();
        assertEquals("Y", encryptChar.encrypt("Z"));
    }

    @Test
    void caesarShift_encryptString_String() {
        CaesarShift encryptString = new CaesarShift();
        assertEquals("GDKKN", encryptString.encrypt("hello"));
    }
}