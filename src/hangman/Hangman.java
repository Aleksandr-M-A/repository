package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
    private static boolean isDead = false;
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            runMenu(br);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void isDead(){
        isDead = true;
    }
    public static void runMenu(BufferedReader br) throws IOException{
        NotificationManager.startNotification();
        String inputLine = "";
        WordManager wordManager = new WordManager();
        if(!wordManager.setNextRandomCurrentWord()) return;
        while(true){
            Attempts attempts = new Attempts(6);
            LettersManager lettersManager = new LettersManager();
            NotificationManager.printCurrentGameInformation(wordManager, lettersManager, attempts);
            while(!(inputLine = br.readLine()).equalsIgnoreCase("выход")) {
                inputLine = inputLine.toUpperCase();
                if(inputLine.length() != 1 || !lettersManager.getAvailableLetters().contains(inputLine)) {
                    NotificationManager.incorrectInputDataNotification();
                    NotificationManager.printCurrentGameInformation(wordManager, lettersManager, attempts);
                    continue;
                }
                wordManager.checkLetter(inputLine, attempts);
                if(isDead) {
                    System.out.println("Правильное слово: " + wordManager.getCurrentWord());
                    NotificationManager.lossNotification();
                    return;
                }
                lettersManager.removeLetter(inputLine);
                NotificationManager.printCurrentGameInformation(wordManager, lettersManager, attempts);
                if(wordManager.isWordGuessedCorrectly()) {
                    NotificationManager.successNotification();
                    return;
                }
            }
        }
    }
}
