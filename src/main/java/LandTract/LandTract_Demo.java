package LandTract;


import LandTract.LandTract;
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
public class LandTract_Demo {
    public static void main(String[] args) {
        double myLength; 
        double myWidth; 
        double myLength2;
        double myWidth2; 
        //define a new land tract
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the length of your land tract: ");
        myLength = keyboard.nextDouble();
        System.out.println("Enter the width of your land tract: ");
        myWidth = keyboard.nextDouble(); 
        LandTract firstLandTract = new LandTract(myLength, myWidth);
        
        //define another land tract
        System.out.println("Enter another length: ");
        myLength2 = keyboard.nextDouble(); 
        System.out.println("Enter another width: "); 
        myWidth2 = keyboard.nextDouble(); 
        LandTract secondLandTract = new LandTract (myLength2, myWidth2); 
        
        //display information for land tract 1  
        System.out.println("Here are your two land tracts!"); 
        System.out.println("\nLand Tract 1: ");
        System.out.println(firstLandTract.toString());
        System.out.println("Area: " + firstLandTract.getArea());
        
        //display information for land tract 2
        System.out.println("\nLand Tract 2: "); 
        System.out.println(secondLandTract.toString()); 
        System.out.println("Area: " + secondLandTract.getArea());
        
        //Compare the two land tracts 
        if (firstLandTract.equals(secondLandTract)) {
            System.out.println("\nThe two land tracts are the same size!"); 
        }
        else {
            System.out.println("\nThe two land tracts are not the same size."); 
        }
        
    }
}
