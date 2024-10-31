package hangman;

public class Attempts {
    private int availableAttempts;
    public Attempts(int availableAttempts){
        this.availableAttempts = availableAttempts;
    }
    public void failedAttempt(){
        availableAttempts--;
        if(availableAttempts == 0){
            Hangman.isDead();
        }
        System.out.println("ÍÅÏĞÀÂÈËÜÍÎ!");
    }
    public int getAvailableAttempts(){
        return availableAttempts;
    }
}
