/*
 * Problem Statement:
 * Given length in inches,  your program "Inches.java" should output the equivalent length in feet and 
 * remaining inch(es). Your code should prompt the user to provide the length in inches at the very 
 * beginning.
 * 
 * Author: Merdan Garlyyev
 * Date: Aug 25, 2023
 */

package Week2;
import java.util.Scanner;

public class ProgrammingProject1a {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int inches; //to save the inches value
        int feet;
        int remainingInches;

        // Step 2: Prompt user and get input
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter inches value: ");
        inches = inputDevice.nextInt();

        // Step 3: Calculations
        feet = inches/12; 
        remainingInches = inches % 12;    // 25 % 12 = 1

        // Step 4: Print output   
        System.out.println(inches + " inches = " + feet +" ft " +remainingInches + " in"); 



    }

        

}
