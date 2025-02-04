package util.move;



import entity.Island;
import entity.Location;

import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;

import java.util.concurrent.ThreadLocalRandom;




public class ToMove {


    private static Direction directionMove(){
        int number = ThreadLocalRandom.current().nextInt(1,5);
        return switch (number){
            case 1 -> Direction.UP;
            case 2 ->Direction.LEFT;
            case 3 -> Direction.DOWN;
            case 4 ->Direction.RIGHT;
            default ->  throw new RuntimeException("Direction no found: "+ number);
        };
    }
    private Class className;
    private CREATURE_TYPE creatureType;
    Island[][] islands;



    public ToMove(Class name, CREATURE_TYPE creatureType) {
        this.className = name;
        this.creatureType = creatureType;
    }


    private void moveToUp(Integer x, Integer y){

    }
    private  void moveToLeft(Integer x,Integer y){

    }
    private  void moveDown(Integer x,Integer y){

    }
    private  void moveToRight(Integer x,Integer y){

    }
    public void toMove( Integer countRangeStep,Integer j, Integer i){
        Integer rangeStep = countRangeStep;
        Direction direction = directionMove();

        //получить Х и У клетки
        int y = i;
        int x = j;

        switch (direction){
            case RIGHT -> {
                int r = x + rangeStep;
                if (checkMove(r, y)){
                    moveToRight(r, y);
                }
            }
            case LEFT -> {
                int l = x - rangeStep;
                if (checkMove(l, y)){
                    moveToLeft(l, y);
                }
            }
            case UP -> {
                int u = y + rangeStep;
                if (checkMove(x, u)){
                    moveToUp(x, u);
                }
            }
            case DOWN -> {
                int d = y- rangeStep;
                if (checkMove(x, d)){
                    moveDown(x, d);
                }
            }
            default -> throw new RuntimeException("Direction no found: ");
        }

    }
    private boolean checkMove(Integer x,Integer y){


        return  false;
    }
}
