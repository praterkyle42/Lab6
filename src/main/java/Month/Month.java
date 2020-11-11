package Month;
import Month.MonthsOfTheYear;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kylep
 */
public class Month {
    private int monthNumber; 
    private String monthName;
    
    //No arg constructor
    public Month() {
       this.monthNumber = 1; 
    }
    
    //Constructor using month number argument
    public Month(int monthNumber) {
       if (monthNumber <= 12 && monthNumber > 1) {
           this.monthNumber = monthNumber; 
       }
       else {
           this.monthNumber = 1; 
       }
     }
    
    //Constructor using month name argument 
    public Month(String monthName) { 
        String myMonthName = monthName.toUpperCase(); 
        this.monthName = myMonthName; 
        setMonthNumber(this.monthName); 
    }
    
    //Method to get the month number
    public int getMonthNumber() {
        return this.monthNumber; 
    }

    //Set the month number
    public void setMonthNumber(int monthNumber) {
        if (monthNumber <=12 && monthNumber >1) {
        this.monthNumber = monthNumber;
        }
        else{
        this.monthNumber = 1; 
        } 
    }
    
    //Set the month number if the object is initialized with a string
    public void setMonthNumber(String monthName) {
        MonthsOfTheYear myMonth = MonthsOfTheYear.valueOf(monthName); 
        this.monthNumber = myMonth.ordinal() + 1; 
    }
    
    //Get the name of the month if the object is initialized with an int
    public String getMonthName() {   
        for (MonthsOfTheYear m : MonthsOfTheYear.values()) {
            if (m.ordinal() + 1 == this.monthNumber) {
                this.monthName = m.name();
            }
        }
        return this.monthName; 
    }

    //To string method with same function as getMonthName
    @Override
    public String toString() {
        return this.getMonthName();
    }
    
    //Greater than method
    public boolean greaterThan(Month mySecondMonth) {
        boolean isGreaterThan = false;
        int monthNumber1 = this.monthNumber; 
        int monthNumber2 = mySecondMonth.getMonthNumber(); 
        if (monthNumber1 > monthNumber2) {
            isGreaterThan = true; 
        } 
        return isGreaterThan; 
    }
    
    //Less than method
    public boolean lessThan(Month mySecondMonth) {
        boolean isLessThan = false; 
        int monthNumber1 = this.monthNumber; 
        int monthNumber2 = mySecondMonth.getMonthNumber(); 
        if (monthNumber1 < monthNumber2) {
            isLessThan = true; 
        }
        return isLessThan; 
    }
    
    //Equals method
    public boolean equals(Month mySecondMonth) {
        boolean isEqual = false; 
        int monthNumber1 = this.monthNumber; 
        int monthNumber2 = mySecondMonth.getMonthNumber(); 
        if (monthNumber1 == monthNumber2) {
            isEqual = true; 
        }
        return isEqual; 
    }
 }

