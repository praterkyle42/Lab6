package LandTract;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class LandTract {
    private double length; 
    private double width; 
    
    public LandTract(double length, double width) {
       this.length = length; 
       this.width = width; 
   }
    public LandTract() {
       length = 0; 
       width = 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
       double area; 
       area = this.length * this.width;
       return area;
    }
    public boolean equals(LandTract myLandTract) {
        return this.getLength() == myLandTract.getLength() && this.getWidth() == myLandTract.getWidth(); 
    }

    @Override
    public String toString() {
        return "" + "length = " + length + ", width = " + width;
    }
    
    }
    
   

