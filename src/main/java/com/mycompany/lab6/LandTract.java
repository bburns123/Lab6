/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author Brendyn Burns
 */
public class LandTract {
    Scanner scanner = new Scanner(System.in);
    double length;
    double width;
    double area;
    
    public LandTract() {
        System.out.println("Length: ");
        length = scanner.nextDouble();
        
        System.out.println("Width: ");
        width = scanner.nextDouble();
        area = 0.0;
    }

    public double Area() {
        double area = length * width;
        this.area = area;
        return area;
    }
    
    public LandTract(double inLength, double inWidth) {
        inLength = length;
        inWidth = width;
    }

    public boolean equalTo(LandTract inLandTrack){
        boolean equal = false;
        if (area == (inLandTrack.area)) {
            equal = true;
        }
        return equal;
    }

    @Override
    public String toString() {
        return "\n" + "Length: " + length + "\n" + "Width: " + width + "\n" + "Area: " + area;
    }
    
    
    
    
}
