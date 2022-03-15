package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    
    public static void main(String[] args){
        int position = 0;
        int dice = (int) (Math.random()*6)+1;
        System.out.println("No of dice : "+dice);
        int option = (int) (Math.random()*3);
        System.out.println("Option : "+option);
        switch (option) {
            case LADDER :
                position = position + dice;
                break;
            case SNAKE :
                position = position - dice;
                break;
        }
        System.out.println("Position : "+position);
    }
}
