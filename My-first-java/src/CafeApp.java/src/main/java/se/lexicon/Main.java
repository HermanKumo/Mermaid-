package se.lexicon;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        {

        }
        System.out.print("Welcome to lexicon Cafe what is your name?");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();


        System.out.println(" Hi " + name+"! Here is our menu:");
        System.out.println("==============================");
        System.out.println("Lexicon Cafe");
        System.out.println("==============================");
        System.out.println("1. Espresso         25.00 SEK");
        System.out.println("2. Cappuccino       35.00 SEK");
        System.out.println("3. Latte            40.00 SEK");
        System.out.println("4. Croissant        30.00 SEK");
        System.out.println("5. Sandwich         55.00 SEK");
        System.out.println("==============================");


        System.out.println("Enter item number (1-5)?");
        sc = new Scanner(System.in);

        String Number = sc.nextLine();


        System.out.println("How many?");
        sc = new Scanner(System.in);

        String Quantity = sc.nextLine();

        System.out.println("Loyalty member? (yes/no)");
        sc = new Scanner(System.in);

        String Answer = sc.nextLine();






        System.out.println("Enter item number (1-5)");
        System.out.println("How many?");
        System.out.println("Loyalty member? (yes/no)");
        System.out.println("==============================");
        System.out.println("Lexicon Cafe");
        System.out.println("==============================");
        System.out.println("Customer : " + name);
        double a = 25.00;
        double b = 35.00;
        double c = 40.00;
        double d = 30.00;
        double e = 55.00;

        if (Objects.equals(Number, "1")) {
            System.out.println("item : Espressos x " + Quantity);
            System.out.println("Subtotal : " + a +"SEK");
        }
        else if (Number.equals("2")) {
            System.out.println("item : Cappuccino x " +  Quantity);
            System.out.println("Subtotal : " + b +"SEK");
        }
        else if (Number.equals("3")) {
            System.out.println("item : Latte x " +  Quantity);
            System.out.println("Subtotal : " + c +"SEK");
        }
        else if (Number.equals("4")) {
            System.out.println("item : Croissant x " +  Quantity);
            System.out.println("Subtotal : " + d + "SEK");
        }
        else if (Number.equals("5")) {
            System.out.println("item : Sandwich x " +  Quantity);
            System.out.println("Subtotal  :  " + e + "SEk");
        }

    }
    }
