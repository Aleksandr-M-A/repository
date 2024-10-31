package hangman;

public class NotificationManager {
    public static void startNotification(){
        System.out.println("���� ��������!");
    }
    public static void successNotification(){
        System.out.println("�����������! �� �������� �����");
    }
    public static void lossNotification(){
        System.out.println("�� ���������!");
    }
    public static void incorrectInputDataNotification(){
        System.out.println("�� ����� ������������ ������.\n�������� ���� ����� �� ������ ��������� ��� ������.");
    }
    public static void availableAttemptsNotification(Attempts attempts){
        int availableAttempts = attempts.getAvailableAttempts();
        String attempt = "";
        switch (availableAttempts % 10){
            case 1 -> attempt = " �������";
            case 2, 3, 4 -> attempt = " �������";
            case 5, 6, 7, 8, 9, 0 -> attempt = " �������";
        }
        System.out.println("� ��� �������� " + attempts.getAvailableAttempts() + attempt);
    }
    public static void printCurrentGameInformation(WordManager wordManager, LettersManager lettersManager, Attempts attempts){
        availableAttemptsNotification(attempts);
        System.out.println("����������� �����: ");
        System.out.println(wordManager.getHiddenCurrentWord());
        lettersManager.printAvailableLetters();
        lettersManager.printUnavailableLetters();
        System.out.println("__________________________________");
        System.out.println("__________________________________");
    }
}
