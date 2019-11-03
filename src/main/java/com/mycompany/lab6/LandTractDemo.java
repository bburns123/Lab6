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
public class LandTractDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Creates two separate land track objects, uses a scanner, and finds area
        LandTract landTrackOne = new LandTract();
        LandTract landTrackTwo = new LandTract();
        double landTrackAreaOne = landTrackOne.Area();
        double landTrackAreaTwo = landTrackTwo.Area();
        
        //Prints length, width, and area
        System.out.println("LAND TRACK ONE" + "\n" + "------------" + landTrackOne.toString());
        System.out.println("LAND TRACK TWO" + "\n" + "------------" + landTrackTwo.toString());
        
        //Finds if they are equal
        if (landTrackTwo.equalTo(landTrackOne)) {
            System.out.println("The areas are equal to one another");
        }
        else
          System.out.println("The areas are NOT equal");
    }

}