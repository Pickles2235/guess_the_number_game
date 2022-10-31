package game;

public class GuessTheNumber extends BaseGame {
    @Override
    public void play() {

        String userGuess;
        int noOfGuesses = 1;
        int targetNum = randNum(1,100);

        while(true){
            //userGuess = inputPrompt("Input guess " + noOfGuesses + " ");
            userGuess = inputPrompt(String.format("Inout guess %d ", noOfGuesses));
            noOfGuesses++;

            if(strToNum(userGuess) == targetNum){
                System.out.println("Well done you did it there is no cake");
                break;
            }

            if(strToNum(userGuess) > targetNum){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
        }


    }

    private int strToNum(String userGuess){
        while(true) {
            try {
                int convGuess = Integer.parseInt(userGuess);
                return convGuess;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid just like you");
            }
        }
    }
}
