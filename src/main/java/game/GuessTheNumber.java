package game;

public class GuessTheNumber extends BaseGame {
    private int guesses;
    private final int lowerBound;
    private final int upperbound;
    private final int numberToGuess;

    public GuessTheNumber(int lowerBound, int upperbound){
        guesses = 1;

        this.lowerBound = lowerBound;
        this.upperbound = upperbound;

        numberToGuess = super.generateNumber(lowerBound, upperbound);
    }

    @Override
    public void play() {
        String userGuess;

        System.out.println("Welcome to guess the number! Guess my number between " + lowerBound + " & " + upperbound);

        //Start game loop
        while(true){
            userGuess = getUserInput("Guess " + guesses);

            if(checkGuess(userGuess)){
                System.out.println("You guess correctly and it only took " + guesses + " turn/s");
                break;
            }else{
                guesses++;
            }
        }
    }

    /**
     * Given a number, it will run comparisons against the number to guess and provide aid if the user needs to go
     * higher or lower when guessing.
     * @param userGuess Number which user has entered as a guess
     * @return true or false based on if the number passed by user was a match or not
     */
    private boolean checkGuess(String userGuess){
        int number;
        try{
            //Convert from string to integer
            number = Integer.parseInt(userGuess);

            if(number == numberToGuess) return true;

            if(number < lowerBound || number > upperbound){
                System.out.println(number + " isn't even in the range! You even trying?");
                return false;
            }

            if(number < numberToGuess){
                System.out.println(number + " is too low");
            }else{
                System.out.println(number + " is too high");
            }

            return false;

        }catch(NumberFormatException ex){
            System.out.println(userGuess + " isn't a valid number");
            return false;
        }
    }
}
