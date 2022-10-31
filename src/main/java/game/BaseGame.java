package game;

import utils.IO;

import java.util.concurrent.ThreadLocalRandom;

public abstract class BaseGame extends IO implements Game{

    /**
     * Generate a number between a given range
     * @param min lower bound which can be produced (inclusive)
     * @param max upper bound which can be generated (inclusive)
     * @return random number within the range provided by min max
     */
    protected int generateNumber(int min, int max){
        if(min >= max) throw new IllegalArgumentException("Lower bound can't equal or exceed upper bound");

        return ThreadLocalRandom.current().nextInt((max - min) + 1) + min;
    }
}
