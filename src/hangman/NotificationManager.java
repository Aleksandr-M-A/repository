package hangman;

public class NotificationManager {
    public static void startNotification(){
        System.out.println("Игра началась!");
    }
    public static void successNotification(){
        System.out.println("Поздравляем! Вы отгадали слово");
    }
    public static void lossNotification(){
        System.out.println("Вы проиграли!");
    }
    public static void incorrectInputDataNotification(){
        System.out.println("Вы ввели некорректные данные.\nВыберите одну букву из списка доступных для выбора.");
    }
    public static void availableAttemptsNotification(Attempts attempts){
        int availableAttempts = attempts.getAvailableAttempts();
        String attempt = "";
        switch (availableAttempts % 10){
            case 1 -> attempt = " попытка";
            case 2, 3, 4 -> attempt = " попытки";
            case 5, 6, 7, 8, 9, 0 -> attempt = " попыток";
        }
        System.out.println("У Вас осталось " + attempts.getAvailableAttempts() + attempt);
    }
    public static void printCurrentGameInformation(WordManager wordManager, LettersManager lettersManager, Attempts attempts){
        availableAttemptsNotification(attempts);
        System.out.println("Угадываемое слово: ");
        System.out.println(wordManager.getHiddenCurrentWord());
        lettersManager.printAvailableLetters();
        lettersManager.printUnavailableLetters();
        System.out.println("__________________________________");
        System.out.println("__________________________________");
    }
}
