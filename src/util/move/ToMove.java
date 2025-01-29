package util.move;

import util.rndm.Rndm;

public class ToMove {
    public static Direction directionMove(){
        int number = Rndm.random.nextInt(1,5);
        return switch (number){
            case 1 -> Direction.UP;
            case 2 ->Direction.LEFT;
            case 3 -> Direction.DOWN;
            case 4 ->Direction.RIGHT;
            default ->  throw new RuntimeException("Direction no found: "+ number);
        };
    }
}
