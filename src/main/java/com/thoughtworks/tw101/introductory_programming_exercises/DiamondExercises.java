package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        System.out.println();
        drawADiamond(8);
        System.out.println();
        drawADiamondWithYourName(3);
        System.out.println();
    }

    private static void drawAnIsoscelesTriangle(int n) {

        int numSpaces = (n*2-1)/2;
        int numStars = 1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars+=2;
        }
    }

    private static void drawAnIsoscelesTriangleReverse(int n) {
        int numSpaces = 1;
        int numStars = (n*2)-1;

        for (int i=0; i<n; i++) {
            for (int j=0; j<numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars-=2;
        }
    }


    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawAnIsoscelesTriangleReverse(n-1);

    }

    private static void drawADiamondWithYourName(int n) {
        drawAnIsoscelesTriangle(n);
        System.out.println("Laura");
        drawAnIsoscelesTriangleReverse(n-1);
        }
}
