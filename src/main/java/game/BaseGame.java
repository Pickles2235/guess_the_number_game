package game;

import utils.IO;

import java.util.concurrent.ThreadLocalRandom;

public abstract class BaseGame extends IO implements Game{

    protected int randNum(int lower,int upper){
        return ThreadLocalRandom.current().nextInt((upper-lower)+1)+lower;
    }

}
