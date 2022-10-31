import game.Game;
import game.GuessTheNumber;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game game = new GuessTheNumber(1, 10);
        game.play();
    }
}
