package se.lexicon;

import  java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        IO.println("Sofia 22 Stockholm"); // 4. Simple Console Output

        Scanner console = new Scanner(System.in);

        void main ;(String[] args){
            int year;

            System.out.println("Enter the year");
            year = console.nextInt();

            if(year%4==0){
                System.out.println(year+ "is a leap year");
            }
            else{
                System.out.println(year+ "is not a leap year");
            }
        }

    }
}
