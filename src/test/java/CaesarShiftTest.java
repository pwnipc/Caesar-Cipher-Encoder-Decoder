import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarShiftTest {
    @Test

    public void caesarShift_encryptChar_String(){
        CaesarShift testType = new CaesarShift();
        assertEquals("Y", testType.encrypt("Z"));
    }

}