import java.io.Console;

public class App {
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String  NEUTRAL = "\033[0m";  // NEUTRAL
    public static void main(String[] args){
        Console myConsole = System.console();
        CaesarShift myCaesar = new CaesarShift();
        boolean running = true;
        String version = "V1.0";

        System.out.println(BLUE+"  ____                           ____  _     _  __ _   \n" +
                " / ___|__ _  ___  ___  __ _ _ __/ ___|| |__ (_)/ _| |_ \n" +
                "| |   / _` |/ _ \\/ __|/ _` | '__\\___ \\| '_ \\| | |_| __|\n" +
                "| |__| (_| |  __/\\__ \\ (_| | |   ___) | | | | |  _| |_ \n" +
                " \\____\\__,_|\\___||___/\\__,_|_|  |____/|_| |_|_|_|  \\__|"+version+NEUTRAL);
        System.out.println(RED+"             Encrypt/Decrypt your messages"+NEUTRAL);
        System.out.println(BLUE+"                    By @Chal13W1zz"+NEUTRAL);

        while (running){

            System.out.println("\n \nSelect an option \n -> Encrypt a message : 1 \n -> Decrypt a message : 2 \n -> Exit : 3 ");
            Integer option = Integer.parseInt(myConsole.readLine(BLUE+"option"+GREEN+"@caesar:"+BLUE+"~$ "+NEUTRAL));


            if(option == 1){
                System.out.println("\nEnter the message to Encrypt : ");
                String message = myConsole.readLine(BLUE+"message"+GREEN+"@caesar:"+BLUE+"~$ "+NEUTRAL);
                System.out.println("\nEnter the shift key '1 - 25' :");
                int key = Integer.parseInt(myConsole.readLine(BLUE+"key"+GREEN+"@caesar:"+BLUE+"~$ "+NEUTRAL));
                myCaesar.setKey(key);
                myCaesar.encrypt(message);
                System.out.println(RED+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+NEUTRAL);
                System.out.println(BLUE+"Input String: "+GREEN+message);
                System.out.println(BLUE+"Encrypted String: "+GREEN+myCaesar.getEncryptedMsg());
                System.out.println(BLUE+"Shift/Encryption key : "+GREEN+myCaesar.getKey()+NEUTRAL);
                System.out.println(RED+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+NEUTRAL);

            }else if(option == 2){
                System.out.println("Enter the message to Decrypt : ");
                String message = myConsole.readLine(BLUE+"encryptedMessage"+GREEN+"@caesar:"+BLUE+"~$ "+NEUTRAL);
                System.out.println("\nEnter the shift key '1 - 25' :");
                int key = Integer.parseInt(myConsole.readLine(BLUE+"key"+GREEN+"@caesar:"+BLUE+"~$ "+NEUTRAL));
                myCaesar.setKey(key);
                myCaesar.decrypt(message);
                System.out.println(RED+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+NEUTRAL);
                System.out.println(BLUE+"Input String: "+GREEN+message);
                System.out.println(BLUE+"Decrypted String: "+GREEN+myCaesar.getDecryptedMsg());
                System.out.println(BLUE+"Shift/Decryption key : "+GREEN+myCaesar.getKey()+NEUTRAL);
                System.out.println(RED+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+NEUTRAL);

            }else if(option == 3){
                System.out.println(RED+"Goodbye :)");
                running = false ;
            }else {
                System.out.println(RED+"Oops!, invalid Option :("+NEUTRAL);
            }
        }

        //
//        int
//        CaesarShift encDec = new CaesarShift("Hello",25);
//        System.out.println("Input String: " + input);
//        System.out.println("Encrypted: " + encDec.encrypt(input));
//        System.out.println("Decrypted String: "+encDec.decrypt(encDec.encrypt(input)));
    }
}
