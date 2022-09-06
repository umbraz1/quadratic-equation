package com.epam.rd.autotasks;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double result = 0;
        double x1, x2;

        double D = (b * b) - 4 * a * c;

        if (D < 0){

            System.out.println("no roots");
        }else if(D == 0){

         result = (-b / 2 * a );
         System.out.println(result);
        }else{

            x1=((-b + Math.sqrt(D)) / (2 * a) );
            x2=((-b - Math.sqrt(D)) / (2 * a) );

            System.out.println(x1 + " " + x2);

        }

    }

}