/*
Write a program using a switch statement to print the month names given the exact number of days in the month.
If the user enters 30 then the program will display: "September April June November". If the user enters 9 then program
will alert the user that no months have exactly 9 days.

You can have more than one statement in each switch case.
*/

import java.util.Scanner;

public class MySwitch {

       public static void main (String[] args){

       int numDays;
       int count =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in the number of days..");
        numDays = input.nextInt();

        while(numDays >0) {
            count++;

            switch (numDays) {

                case 28:
                    System.out.println("February");
                    break;

                case 29:
                    System.out.println("It's a Leap year. Month is February");
                    break;

                case 30:
                    System.out.println("April");
                    System.out.println("June");
                    System.out.println("September");
                    System.out.println("November");
                    break;

                case 31:
                    System.out.println("January");
                    System.out.println("March");
                    System.out.println("May");
                    System.out.println("July");
                    System.out.println("August");
                    System.out.println("October");
                    System.out.println("December");
                    break;

                default:
                    System.out.println("Sorry. You entered invalid number of days");

            }
            System.out.println("\nPlease enter in the number of days..");
            System.out.println("Please enter 0 to exit");
            numDays = input.nextInt();
        }

    }
}
