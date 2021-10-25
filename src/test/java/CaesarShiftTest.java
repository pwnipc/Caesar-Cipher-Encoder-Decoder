import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftTest {
    @Test
    public void caesarShift_isEncryptUpcasedTest_Boolean() {
        CaesarShift encryptCaseCheck = new CaesarShift();
        assertEquals(true, Character.isUpperCase(encryptCaseCheck.encrypt("a").charAt(0)));
    }

    @Test
    void caesarShift_encryptStringTest_String() {
        CaesarShift encryptString = new CaesarShift();
        assertEquals("GDKKN", encryptString.encrypt("hello"));
    }

    @Test
    public void caesarShift_isDecryptMsgUpcasedTest_String() {
        CaesarShift caseTest = new CaesarShift();
        assertEquals(true, Character.isUpperCase(caseTest.decrypt("a").charAt(0)));
    }

    @Test
    public void caesarShift_decryptStringTest_String(){
        CaesarShift decryptStringTest = new CaesarShift();
        assertEquals("Z", decryptStringTest.decrypt("Y"));
    }


}