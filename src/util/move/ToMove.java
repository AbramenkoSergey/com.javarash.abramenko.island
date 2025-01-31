package util.move;



import entity.Island;
import entity.Location;

import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import util.rndm.Rndm;


public class ToMove {

    private static Direction directionMove(){
        int number = Rndm.random.nextInt(1,5);
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


    public ToMove(Class name, CREATURE_TYPE creatureType) {
        this.className = name;
        this.creatureType = creatureType;
    }


    private void moveToUp(Integer x, Integer y){
        try {
            Location moveLocation = Island.class.newInstance().getLocationPoint(x, y);
            Class.class.getComponentType();
            for (int i = 0; i < moveLocation.arrayAnimalInLocate.length; i++) {
                if(moveLocation.arrayAnimalInLocate[i].equals(className))
                for (int j = 0; j < moveLocation.arrayAnimalInLocate[i].length; j++) {
                    if(moveLocation.arrayAnimalInLocate[i][j] != null){
                        Factory factory = new Factory();
                        moveLocation.arrayAnimalInLocate[i][j] = factory.create(creatureType);
                    }

                }

            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
    private  void moveToLeft(Integer x,Integer y){
        try {
            Location moveLocation = Island.class.newInstance().getLocationPoint(x, y);
            Class.class.getComponentType();
            for (int i = 0; i < moveLocation.arrayAnimalInLocate.length; i++) {
                if(moveLocation.arrayAnimalInLocate[i].equals(className))
                    for (int j = 0; j < moveLocation.arrayAnimalInLocate[i].length; j++) {
                        if(moveLocation.arrayAnimalInLocate[i][j] != null){
                            Factory factory = new Factory();
                            moveLocation.arrayAnimalInLocate[i][j] = factory.create(creatureType);

                        }

                    }

            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    private  void moveDown(Integer x,Integer y){
        try {
            Location moveLocation = Island.class.newInstance().getLocationPoint(x, y);
            Class.class.getComponentType();
            for (int i = 0; i < moveLocation.arrayAnimalInLocate.length; i++) {
                if(moveLocation.arrayAnimalInLocate[i].equals(className))
                    for (int j = 0; j < moveLocation.arrayAnimalInLocate[i].length; j++) {
                        if(moveLocation.arrayAnimalInLocate[i][j] != null){
                            Factory factory = new Factory();
                            moveLocation.arrayAnimalInLocate[i][j] = factory.create(creatureType);

                        }

                    }

            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    private  void moveToRight(Integer x,Integer y){
        try {
            Location moveLocation = Island.class.newInstance().getLocationPoint(x, y);
            Class.class.getComponentType();
            for (int i = 0; i < moveLocation.arrayAnimalInLocate.length; i++) {
                if(moveLocation.arrayAnimalInLocate[i].equals(className))
                    for (int j = 0; j < moveLocation.arrayAnimalInLocate[i].length; j++) {
                        if(moveLocation.arrayAnimalInLocate[i][j] != null){
                            Factory factory = new Factory();
                            moveLocation.arrayAnimalInLocate[i][j] = factory.create(creatureType);

                        }

                    }

            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
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
        try {
            if (Island.class.newInstance().getLocationPoint(x, y) != null){
                return true;
            }else {
                return false;
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
