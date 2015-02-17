package com.practice;

/**
 * Created by cristianivascu on 17/02/2015.
 */
public class Introduction {
    public static void main(String[] args) {
        //printStar();
        //printLine(8);
        //printVerticalLine(3);
        //printRightTriangle(8);
        //printIsoscelesTriangle(5);
        printDiamond(9);
        printNameDiamond(4);
    }

    public static void printStar(){
        System.out.print("*");
    }

    public static void printWhiteSpace(){
        System.out.print(" ");
    }

    public static void printLine(int length){
        for(int i=0; i<length; i++) {
            printStar();
        }
    }

    public static void printWhiteLine(int length){
        for(int i=0; i<length; i++) {
            printWhiteSpace();
        }
    }

    public static void printVerticalLine(int length){
        for(int i=0; i<length; i++) {
            printStar();
            System.out.println();
        }
    }

    public static void printIsoscelesLine(int maxHeight, int currentHeight){
        int leftWhiteSpace = maxHeight - currentHeight -1;
        int stars = 2*currentHeight+1;
        printWhiteLine(leftWhiteSpace);
        printLine(stars);
        System.out.println();
    }

    public static void printRightTriangle(int length){
        for(int i=0; i<length; i++) {
            printLine(i+1);
            System.out.println();
        }

    }

    public static void printIsoscelesTriangle(int maxHeight, int offset){
        for(int currentHeight=0; currentHeight<maxHeight; currentHeight++) {
            printIsoscelesLine(maxHeight+offset, currentHeight);
        }
    }

    public static void printReverseIsoscelesTriangle(int maxHeight, int offset){
        for(int currentHeight=maxHeight-1; currentHeight>=0; currentHeight--) {
            printIsoscelesLine(maxHeight+offset, currentHeight);
        }
    }

    public static void printDiamond(int length){
        printIsoscelesTriangle(length,0);
        printReverseIsoscelesTriangle(length-1,1);
    }

    public static void printNameDiamond(int length){
        printIsoscelesTriangle(length-1,1);
        System.out.println("Cristian");
        printReverseIsoscelesTriangle(length-1,1);
    }
}
