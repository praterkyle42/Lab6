package Month;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kylep
 */
public class Month_Demo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        String monthName = ""; 
        int monthNumber = 1; 
        Month myFirstMonth = new Month();
        Month mySecondMonth = new Month(); 
        Month thisMonth = new Month("November");
        
        //Ask user to enter a month
        System.out.println("Enter a month: "); 
        
        //Determine if the month was entered as a month name or as a month number and set the value to myFirstMonth
        if (keyboard.hasNextInt()) {
            monthNumber = keyboard.nextInt(); 
            myFirstMonth.setMonthNumber(monthNumber);
        } 
        else {
            monthName = keyboard.next(); 
            monthName = monthName.toUpperCase();
            myFirstMonth.setMonthNumber(monthName);
        } 
        
        //Ask the user for another month
        System.out.println("Enter another month: "); 
        
        //Repeat the process for mySecondMonth
        if (keyboard.hasNextInt()) {
            monthNumber = keyboard.nextInt(); 
            mySecondMonth.setMonthNumber(monthNumber);
        } 
        else {
            monthName = keyboard.next(); 
            monthName = monthName.toUpperCase();
            mySecondMonth.setMonthNumber(monthName);
        }
        
        //Display the two user created months and compare them to this month
        System.out.println("The current month is: " + thisMonth.getMonthName()); 
        System.out.println("This is month number " + thisMonth.getMonthNumber() + " of the year");
        
        System.out.println("\nThe first month you entered was: " + myFirstMonth.getMonthName());
        System.out.println("This is month number " + myFirstMonth.getMonthNumber() + " of the year"); 
        if (thisMonth.greaterThan(myFirstMonth)) {
            System.out.println(myFirstMonth.getMonthName() + " comes before " + thisMonth.getMonthName());
        } 
        else if (thisMonth.lessThan(myFirstMonth)) {
            System.out.println(myFirstMonth.getMonthName() + " comes after " + thisMonth.getMonthName());
        }
        else if (thisMonth.equals(myFirstMonth)) {
            System.out.println("You entered the current month!");
        }
        System.out.println("\nThe second month you entered was: " + mySecondMonth.getMonthName());
        System.out.println("This is month number " + mySecondMonth.getMonthNumber() + " of the year");
        if (thisMonth.greaterThan(mySecondMonth)) {
            System.out.println(mySecondMonth.getMonthName() + " comes before " + thisMonth.getMonthName());
        } 
        else if (thisMonth.lessThan(mySecondMonth)) {
            System.out.println(mySecondMonth.getMonthName() + " comes after " + thisMonth.getMonthName());
        }
        else if (thisMonth.equals(mySecondMonth)) {
            System.out.println("You entered the current month!");
        }
        
    }  
}
