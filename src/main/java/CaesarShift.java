import java.util.ArrayList;

public class CaesarShift {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Encapsulate and make the alphabet immutable
    private static  int key = 25; //Initialize and encapsulate the shift key
    private static String encryptedMsg; //Create and encapsulate the message container
    private static String decryptedMsg; //Create and encapsulate the decrypted message container

    public String encrypt(String encryptMsg) {
        String upCased = encryptMsg.toUpperCase();
        char[] upCasedArrs = upCased.toCharArray();//split the string to a character array
        ArrayList<Character> encryptedChars = new ArrayList<Character>();

        //loop through the character array
        for (Character character : upCasedArrs) {
            int index = ALPHABET.indexOf(character.toString());//get the character rank in the alphabet
            int encryptedCharIndex = Math.floorMod((index + key), 26);//shift the character using the key and get the new characters rank in the alphabet
            encryptedChars.add(ALPHABET.charAt(encryptedCharIndex));//get the character from the alphabet rank and add it to the char array
            encryptedMsg = encryptedChars.toString().replaceAll("\\[|\\]|\\s", "").replaceAll(",", "");//convert and cleanup the char array to a string
        }
        return encryptedMsg;
    }

    public String decrypt(String decryptMsg) {
        String upCased = decryptMsg.toUpperCase();
        char[] upCasedArrs = upCased.toCharArray();//split the string to a character array
        ArrayList<Character> decryptedChars = new ArrayList<Character>();

        //loop through the character array
        for (Character character : upCasedArrs) {
            int index = ALPHABET.indexOf(character.toString());//get the character rank in the alphabet
            int decryptedCharIndex = Math.floorMod((index - key), 26);//shift the character using the key and get the new characters rank in the alphabet
            decryptedChars.add(ALPHABET.charAt(decryptedCharIndex));//get the character from the alphabet rank and add it to the char array
            decryptedMsg = decryptedChars.toString().replaceAll("\\[|\\]|\\s", "").replaceAll(",", "");//convert and cleanup the char array to a string
        }
        return decryptedMsg;

    }

    public static int getKey() {
        return key;
    }

    public static void setKey(int key) {
        CaesarShift.key = key;
    }

    public static String getEncryptedMsg() {
        return encryptedMsg;
    }

    public static String getDecryptedMsg() {
        return decryptedMsg;
    }

}
