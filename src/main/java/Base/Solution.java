package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 09
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        double gallonPaint = 350;

        int ceilingLength = ceilingLength();
        int ceilingWidth = ceilingWidth();

        int totalArea = ceilingLength * ceilingWidth;

        double paint = totalArea / gallonPaint;

        int totalPaint = (int) Math.ceil(paint);

        System.out.println("You will need to purchase "+totalPaint+" gallons of paint to cover "+totalArea+" square feet");

    }

    private static int ceilingLength(){

        System.out.print("What is the length of the ceiling in feet? ");
        String length = in.nextLine();
        int ceilingLength = Integer.parseInt(length);
        return ceilingLength;

    }

    private static int ceilingWidth(){

        System.out.print("What is the width of the ceiling in feet? ");
        String width = in.nextLine();
        int ceilingWidth = Integer.parseInt(width);
        return ceilingWidth;

    }
}
