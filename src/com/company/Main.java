package com.company;

import java.util.Random;

public class Main {

    private static  int cols = 9;

    private static void shuffleVertical(Integer[][] board){
        Integer[] line1;
        Integer[] line2;
        Random rand = new Random();
        int r1 = 0;
        int r2 = 0;

        for(int i = rand.nextInt(100); i > 0; i--){
            r1 = rand.nextInt(cols);
            line1 = board[r1];

            while(r1 == r2)
                r2 = rand.nextInt(cols);

            line2 = board[r2];

            board[r1] = line2;
            board[r2] = line1;

        }
    }

    private static void shuffleHorizontal(Integer[][] board){
        Integer[] line1;
        Integer[] line2;
        Random rand = new Random();
        int r1 = 0;
        int r2 = 0;

        for(int i = rand.nextInt(100); i > 0; i--){
            r1 = rand.nextInt(cols);
            line1 = new Integer[cols];
            line2 = new Integer[cols];

            for(int i2 = 0; i2 < cols; i2++)
                line1[i2] = board[i2][r1];

            while(r1 == r2)
                r2 = rand.nextInt(cols);

            for(int i2 = 0; i2 < cols; i2++)
                line2[i2] = board[i2][r2];

            for(int i2 = 0; i2 < cols; i2++){
                board[i2][r1] = line2[i2];
                board[i2][r2] = line1[i2];
            }
        }
    }

    public static void main(String[] args) {
	    Integer[][] board = new Integer[9][9];

	    board[0] = new Integer[]{1,2,3,4,5,6,7,8,9};
        board[1] = new Integer[]{4,5,6,7,8,9,1,2,3};
        board[2] = new Integer[]{7,8,9,1,2,3,4,5,6};
        board[3] = new Integer[]{2,3,4,5,6,7,8,9,1};
        board[4] = new Integer[]{5,6,7,8,9,1,2,3,4};
        board[5] = new Integer[]{8,9,1,2,3,4,5,6,7};
        board[6] = new Integer[]{3,4,5,6,7,8,9,1,2};
        board[7] = new Integer[]{6,7,8,9,1,2,3,4,5};
        board[8] = new Integer[]{9,1,2,3,4,5,6,7,8};

        shuffleVertical(board);
        shuffleHorizontal(board);

        for(Integer[] line: board){
            for(Integer field: line)
                System.out.print(field);
            System.out.println();
        }

    }
}
