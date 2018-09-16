package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args)
    {
        String height ="";
        String base = "";
        double Answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = #Square#");
        System.out.println("2 = #Trangle#");
        System.out.println("3 = #circle#");
        System.out.println("4 = #Rectangle#");
	    System.out.println("Please type a number for one of the four shapes you want to find an area of.");
        String input = sc.next();
        while(true) {
            if (input.equals("1")) {
                Square(height, Answer);
            }

            if (input.equals("2")) {
                Triangle(height, base, Answer);
            }

            if (input.equals("3")) {
                circle(height, Answer);
            }

            if (input.equals("4")) {
                rectangle(base, height, Answer);
            }
            else
                {
                System.out.println("Invalid shape select another.");
                input = sc.next();
            }
        }
    }
    public static  void Square(String side, double Answer)
    {
        System.out.println("You selected square please type in the length of the square.");
        Scanner sc = new Scanner(System.in);
        side = sc.next();
        Answer = pow(Double.parseDouble(side),2);
        System.out.println("The area is: " + Answer);
    }

    public static  void Triangle(String base, String height, double Answer)
    {
        System.out.println("You selected Triangle please type in the base of the Triangle.");
        Scanner sc = new Scanner(System.in);
        base = sc.next();
        System.out.println("Type in the height of the Triangle.");
        height = sc.next();
        Answer = (Double.parseDouble(base) * Double.parseDouble(height)) / 2;
        System.out.println("The area is: " + Answer);
    }

    public static  void circle(String radius, double Answer)
    {
        System.out.println("You selected circle please type in the radius of the circle.");
        Scanner sc = new Scanner(System.in);
        radius = sc.next();
        Answer =  PI * Math.pow((Double.parseDouble(radius)), 2);
        System.out.println("The area is: " + Answer);
    }

    public static  void rectangle(String length, String height, Double Answer)
    {
        System.out.println("You selected rectangle please type in the length of the rectangle.");
        Scanner sc = new Scanner(System.in);
        length = sc.next();
        System.out.println("Type in the height of the rectangle.");
        height = sc.next();
        Answer = Double.parseDouble(length) * Double.parseDouble(height);
        System.out.println("The area is: " + Answer);
    }
}
