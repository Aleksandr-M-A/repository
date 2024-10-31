package hangman;

import java.util.ArrayList;
import java.util.List;

public class LettersManager {
    private List<String> availableLetters;
    private List<String> unAvailableLetters;
    private List<String> russianLetters;

    public LettersManager(){
        russianLetters = new ArrayList<>(List.of("�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�",
        "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�"));
        unAvailableLetters = new ArrayList<>();
        availableLetters = new ArrayList<>();
        availableLetters.addAll(russianLetters);
    }
    public void printAvailableLetters(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < availableLetters.size(); i++){
            if(i % 7 == 0) sb.append("\n");
            sb.append(availableLetters.get(i));
            sb.append(" ");
        }
        String resultLetters = sb.toString();
        System.out.print("���������� ��� ������ �����:");
        System.out.println(resultLetters);
    }
    public void printUnavailableLetters(){
        if(unAvailableLetters.isEmpty()) return;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < unAvailableLetters.size(); i++){
            if(i % 7 == 0) sb.append("\n");
            sb.append(unAvailableLetters.get(i));
            sb.append(" ");
        }
        String resultLetters = sb.toString();
        System.out.print("����������� ��� ������ �����:");
        System.out.println(resultLetters);
    }
    public void removeLetter(String letter){
        availableLetters.remove(letter);
        unAvailableLetters.add(letter);
    }

    public List<String> getAvailableLetters() {
        return availableLetters;
    }
}
