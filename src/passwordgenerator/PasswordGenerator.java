package passwordgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PasswordGenerator {
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIALS = "!@#$%^*()—_+=;:,./?\\|`~[]{}";

    public static void main(String[] args) {
        new PasswordGenerator().start();
    }
    public void start(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String inputLine = "";
            String menuMessage = """
                    Choose option:
                    1 - to get a random secure password of 8-12 characters
                    2 - to choose the length of a password
                    3 - to quit""";
            int menuItemNumber = 0;
            int passwordLength = 0;
            System.out.println(menuMessage);
            while(!(inputLine = br.readLine()).equals("3")){
                try{
                    menuItemNumber = Integer.parseInt(inputLine);
                    if(menuItemNumber < 1 || menuItemNumber > 3) throw new NumberFormatException();
                }catch (NumberFormatException e){
                    System.out.println("Incorrect input data");
                    System.out.println(menuMessage);
                    continue;
                }
                if(menuItemNumber == 2) passwordLength = passwordLengthMenu(br);
                System.out.println(getPassword(passwordLength));;
                break;
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private int passwordLengthMenu(BufferedReader br) throws IOException{
        int passwordLength = 0;
        while(passwordLength == 0){
            System.out.println("Enter password length(must be 8-12 characters)");
            try{
                passwordLength = Integer.parseInt(br.readLine());
                if(passwordLength < 8 || passwordLength > 12) passwordLength = 0;
            }catch (NumberFormatException e){
                System.out.println("Incorrect input data");
            }
        }
        return passwordLength;
    }
    private String getPassword(int length){
        Random random =  new Random();
        int passwordLength = length == 0 ? random.nextInt(8, 13) : length;
        char[] upper = UPPER_CASE.toCharArray();
        char[] lower = LOWER_CASE.toCharArray();
        char[] digits = DIGITS.toCharArray();
        char[] specials = SPECIALS.toCharArray();
        char[] password = new char[passwordLength];
        password[0] = upper[random.nextInt(upper.length)];
        password[1] = lower[random.nextInt(lower.length)];
        password[2] = digits[random.nextInt(digits.length)];
        password[3] = specials[random.nextInt(specials.length)];
        for(int i = 4; i < passwordLength; i++){
            int charType = random.nextInt(4);
            switch (charType){
                case 0-> password[i] = upper[random.nextInt(upper.length)];
                case 1-> password[i] = lower[random.nextInt(lower.length)];
                case 2-> password[i] = digits[random.nextInt(digits.length)];
                case 3-> password[i] = specials[random.nextInt(specials.length)];
            }
        }
        for(int i = 0; i < password.length; i++){
            int randomIndex = random.nextInt(password.length);
            char temp = password[randomIndex];
            password[randomIndex] = password[i];
            password[i] = temp;
        }
        return new String(password);
    }

}
