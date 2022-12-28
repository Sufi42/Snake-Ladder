package com.bl.snakeladder;

import java.util.Random;

public class SnakeLadderGame {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args) {
        Random r = new Random();
        int playerOnePosition = 0, diceCount = 0, ladderCount = 0, snakeCount = 0, noPlayCount = 0;
        int playerTwoPosition = 0, playerTwoDiceCount = 0, playerTwoLadderCount = 0, playerTwoSnakeCount = 0,
                playerTwoNoPlayCount = 0;

        while (playerOnePosition < 100 && playerTwoPosition < 100) {
            int condition = 1;
            while (condition == 1) {
                System.out.println("Player One Plays : ");
                int diceRoll = r.nextInt(7);
                System.out.println("Player rolled : " + diceRoll);
                diceCount++;

                condition = r.nextInt(4);
                System.out.println("Condition is " + condition);

                switch (condition) {

                    case NO_PLAY:
                        System.out.println("No_Play");
                        playerOnePosition = playerOnePosition + 0;
                        noPlayCount++;
                        break;

                    case LADDER:
                        System.out.println("Ladder ");
                        playerOnePosition = playerOnePosition + diceRoll;
                        if (playerOnePosition <= 100) {
                            System.out.println("New Position is  : " + playerOnePosition);
                            System.out.println();
                        } else {
                            playerOnePosition = playerOnePosition - diceRoll;
                            System.out.println("Remains at same position : " + playerOnePosition);
                            System.out.println();
                        }
                        ladderCount++;
                        break;

                    case SNAKE:
                        System.out.println("Snake");
                        playerOnePosition = playerOnePosition - diceRoll;
                        if (playerOnePosition < 0) {
                            playerOnePosition = 0;
                            System.out.println("New Position is  : " + playerOnePosition);
                            System.out.println();
                        }
                        snakeCount++;
                        break;

                    default:
                        System.out.println("Default");
                }
            }
            int conditionOne = 1;
            while (conditionOne == 1) {
                System.out.println("Player two plays");
                int diceRoll = r.nextInt(7);
                System.out.println("Dice roll is : " + diceRoll);
                conditionOne = r.nextInt(4);
                System.out.println("Condition is : " + conditionOne);
                switch (conditionOne) {
                    case NO_PLAY:
                        System.out.println("No_Play");
                        playerTwoPosition = playerTwoPosition + 0;
                        playerTwoNoPlayCount++;
                        break;

                    case LADDER:
                        System.out.println("Ladder ");
                        playerTwoPosition = playerTwoPosition + diceRoll;
                        if (playerTwoPosition <= 100) {
                            System.out.println("New Position is of player tw  : " + playerTwoPosition);
                            System.out.println();
                        } else {
                            playerTwoPosition = playerTwoPosition - diceRoll;
                            System.out.println("Remains at same position : " + playerTwoPosition);
                            System.out.println();
                        }
                        playerTwoLadderCount++;
                        break;

                    case SNAKE:
                        System.out.println("Snake");
                        playerTwoPosition = playerTwoPosition - diceRoll;
                        if (playerTwoPosition < 0) {
                            playerTwoPosition = 0;
                            System.out.println("New Position of player two : " + playerTwoPosition);
                        }
                        playerTwoSnakeCount++;
                        break;

                    default:
                        System.out.println("Default");
                }
            }
        }

        if (playerOnePosition == 100) {
            System.out.println("Player one wins!!!");
            System.out.println("Player One dice count are" + diceCount + "Total ladder taken by playerone is " + ladderCount + "total no play by player one are :"
                    + noPlayCount + "total snakes by player one are " + snakeCount);
        } else {
            System.out.println("Player Two wins!!!");
            System.out.println("Player two dice rolls are " + playerTwoDiceCount + "Total ladder taken by playerone is " + playerTwoLadderCount + "total no play by player one are :"
                    + playerTwoNoPlayCount + "total snakes by player one are " + playerTwoSnakeCount);

        }
    }
}

