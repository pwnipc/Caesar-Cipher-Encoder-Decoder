import java.io.Console;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();
        System.out.println("Enter the text to Encrypt: ");
        String input = myConsole.readLine();
        CaesarShift encDec = new CaesarShift();
        System.out.println("Input String: " + input);
        System.out.println("Encrypted: " + encDec.encrypt(input));
        System.out.println("Decrypted String: "+encDec.decrypt(encDec.encrypt(input)));
    }
}
