package com.practice;

import java.util.ArrayList;
import java.util.List;

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
        //printDiamond(9);
        //printNameDiamond(4);
        //fizzBuzz();
        System.out.println(generate(44));
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
            printWhiteLine(offset);
            printIsoscelesLine(maxHeight, currentHeight);
        }
    }

    public static void printReverseIsoscelesTriangle(int maxHeight, int offset){
        for(int currentHeight=maxHeight-1; currentHeight>=0; currentHeight--) {
            printWhiteLine(offset);
            printIsoscelesLine(maxHeight, currentHeight);
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

    public static void fizzBuzz(){
        for (int i = 0; i<100; i++){
            boolean printedString = false;
            if((i+1)%3 == 0) {
                System.out.print("Fizz");
                printedString = true;
            }
            if((i+1)%5 == 0) {
                System.out.print("Buzz");
                printedString = true;
            }
            if(!printedString)
                System.out.print(i+1);
            System.out.println();

        }
    }

    public static List<Integer> generate(int n){
        List<Integer> primeFactors = new ArrayList<Integer>();
        for(int i = 2; i<=n/2; i++){
            while(n%i == 0){
                primeFactors.add(i);
                n = n/i;
            }
        }

        if (n != 1) {
            primeFactors.add(n);
        }

        return primeFactors;
    }


}
