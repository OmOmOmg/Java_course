package Mosha;

import java.util.Scanner;
import java.text.NumberFormat;

public class Mortgage {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

//Sum of loan

        float sum = 0;
        while (sum < 1000 | sum > 1000000) {
            System.out.println("Principal ($1K - $1M): ");
            sum = scanner.nextFloat();
        }

//Annual interest

        System.out.println("Annual Interest:");
        float percentage = 0;

        while (true) {
            percentage = scanner.nextFloat();
            if (percentage > 0 && percentage <= 30)
                break;
            else {
                System.out.println("Enter a value between 0.1 and 30: ");
            }
        }
        float interest = percentage/100/12;

//Fow how many years? (Period)

        System.out.println("Period (Years): ");
        int period = 0;

        while (true) {
            period = scanner.nextInt();
            if (period > 0 && period <= 30)
                break;
            else {
                System.out.println("Enter a value between 1 and 30: ");
            }
        }

        int term = period * 12;



        float monthlyPayment = (float)(sum*interest*Math.pow((1+interest),term)/(Math.pow((1+interest),term)-1));

        System.out.println("Sum of loan: "+(int)sum+ "$");
        System.out.println("Interest: "+percentage+"%");
        System.out.println("Credit term: "+term+" months");

        System.out.println(monthlyPayment);


        System.out.println(NumberFormat.getCurrencyInstance().format(monthlyPayment));

    }
}
