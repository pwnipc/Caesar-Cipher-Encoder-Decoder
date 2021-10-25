import java.util.ArrayList;

public class CaesarShift {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //Encapsulate and make the alphabet immutable
    private static int key = 25; //Initialize and encapsulate the shift key
    private static String encryptedMsg; //Create and encapsulate the message container

    public String encrypt(String encryptMsg){
        String upCased = encryptMsg.toUpperCase();
        char[] upCasedArrs = upCased.toCharArray();//split the string to a character array
        ArrayList<Character> encryptedChars = new ArrayList<Character>();

        //loop through the character array
        for(Character character : upCasedArrs ){
            int index = ALPHABET.indexOf(character.toString());//get the character rank in the alphabet
            int encryptedCharIndex = (index+key)%26;//shift the character using the key and get the new characters rank in the alphabet
            encryptedChars.add(ALPHABET.charAt(encryptedCharIndex));//get the character from the alphabet rank and add it to the char array
            encryptedMsg = encryptedChars.toString().replaceAll("\\[|\\]|\\s","").replaceAll(",","");//convert and cleanup the char array to a string
        }
      return encryptedMsg;
    }

    public String decrypt(String decryptMsg){
        return decryptMsg.toUpperCase();
    }

}
