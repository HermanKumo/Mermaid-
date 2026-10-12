package se.lexicon;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);
    private static Object eles;

    static void main(String[] args) {
        int year;

        System.out.println("Enter the year");
        year = console.nextInt();

        if (year % 4 == 0) {
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
            }
        }
    }
