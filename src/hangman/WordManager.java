package hangman;

import java.util.List;
import java.util.Random;

public class WordManager {
    private List<String> words;
    private String currentWord;
    private  String hiddenCurrentWord;
    public WordManager(){
        words = Words.getListOfWords();
    }

    public String getCurrentWord() {
        return currentWord;
    }
    public String getHiddenCurrentWord(){
        return hiddenCurrentWord;
    }
    public void checkLetter(String letter, Attempts attempts){
        int index = -1;
        if(!currentWord.contains(letter)){
            attempts.failedAttempt();
            return;
        }
        index = currentWord.indexOf(letter);
        while(index > -1){
            hiddenCurrentWord = hiddenCurrentWord.substring(0, index) + letter + hiddenCurrentWord.substring(index+1);
            index = currentWord.indexOf(letter, index + 1);
        }
    }
    public boolean setNextRandomCurrentWord(){
        if(currentWord!=null) words.remove(currentWord);
        if(words.isEmpty()){
            System.out.println("You have won!");
            return false;
        }
        currentWord = getRandomWord();
        hiddenCurrentWord = currentWord.replaceAll(".", "_");
        return true;
    }
    public boolean isWordGuessedCorrectly(){
        return currentWord.equals(hiddenCurrentWord);
    }
    public String getRandomWord(){
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
