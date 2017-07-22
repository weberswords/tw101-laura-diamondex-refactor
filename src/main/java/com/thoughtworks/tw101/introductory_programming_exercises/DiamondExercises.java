package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);

        System.out.println();
        drawADiamond(8);
        System.out.println();
        drawADiamondWithYourName(3);
        System.out.println();
        drawADiamondWithYourNameCustom(8, "TWU");
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
        int numSpaces = 0;
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
        int numSpaces = 0;
        int numStars = ((n-1)*2)-1;

        for (int i=0; i<n-1; i++) {
            System.out.print(" ");
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

    private static void drawADiamondWithYourName(int n) {
        int numSpaces = ((n-1)*2-1)/2;
        int numStars = 1;

        for (int i=0; i<n-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars += 2;
        }
        System.out.println("Laura");
        numSpaces = 0;
        numStars = ((n-1)*2)-1;

        for (int i=0; i<n-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars -= 2;
        }
    }


    private static void drawADiamondWithYourNameCustom(int n, String inputName) {
        int numSpaces = ((n-1)*2-1)/2;
        int numStars = 1;

        for (int i=0; i<n-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces--;
            numStars += 2;
        }
        int nameLength = inputName.length();
        int nameSpaces = ((n*2-1)-nameLength)/2;
        for (int l=0; l<nameSpaces; l++) {
            System.out.print(" ");
        }
        System.out.println(inputName);

        numSpaces = 0;
        numStars = ((n-1)*2)-1;

        for (int i=0; i<n-1; i++) {
            System.out.print(" ");
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numStars; k++) {
                System.out.print("*");
            }
            System.out.println();
            numSpaces++;
            numStars -= 2;
        }
    }
}
