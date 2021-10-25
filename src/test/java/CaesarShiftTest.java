import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftTest {
    @Test
    public void caesarShift_encryptCheckCase_Boolean() {
        CaesarShift checkCase = new CaesarShift();
        assertEquals(true, Character.isUpperCase(checkCase.encrypt("a").charAt(0)));
    }

    @Test
    void caesarShift_encryptString_String() {
        CaesarShift encryptString = new CaesarShift();
        assertEquals("GDKKN", encryptString.encrypt("hello"));
    }

    @Test
    void caesarShift_decryptCheckCase_Boolean() {
        CaesarShift checkCase = new CaesarShift();
        assertEquals(true, Character.isUpperCase(checkCase.decrypt("z").charAt(0)));
    }

    @Test
    public void caesarShift_decryptString_String(){
        CaesarShift decryptStr = new CaesarShift();
        assertEquals("HELLO", decryptStr.decrypt("GDKKN"));
    }
}