package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args){
        int position = 0;
        while (position < 100) {
            int dice = (int) (Math.random()*6)+1;
            System.out.println("No on dice : "+dice);
            int option = (int) (Math.random()*3);
            //System.out.println("Option : "+option);
            switch (option) {
                case LADDER :
                    System.out.println("Ladder");
                    position = position + dice;
                    break;
                case SNAKE :
                    System.out.println("Snake");
                    position = position - dice;
                    break;
                case NO_PLAY :
                    System.out.println("No Play");
                    break;
            }
            System.out.println("Position : "+position);
            if (position<0) {
                position = 0;
            }
            if (position > 100) {
                position = position - dice;
            }
        }
    }
}
