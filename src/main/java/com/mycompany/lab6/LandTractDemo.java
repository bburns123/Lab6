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
        LandTract landTractOne = new LandTract();
        LandTract landTractTwo = new LandTract();
        
        System.out.println("Please enter length and width");
        double landTractOneArea = landTrackOne.Area();
        double landTractTwoArea = landTrackTwo.Area();
        
        System.out.println(landTractOne.toString());
        System.out.println(landTractTwo.toString());
        
        if(landTrackTwo.equalTo(landTrackOne)) {
            System.out.println("The areas of the two land tracks are equal");
        }
        else
            System.out.println("The areas of the two land tracks are NOT equal");
    }
}
