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
public class MonthDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month: ");
        int input = scanner.nextInt();

        Month month = new Month(input);
        
        System.out.println(month.toString());
        
        if (month.greaterThan(month, input)) {
            System.out.println("Please enter a value that is less than 12");
        }
        else if (month.greaterThan(month, input)) {
            System.out.println("Please enter a value that is greater than 0");
        }
        else if (month.equalTo(month, 0)) {
            System.out.println("Please enter a value greater than 0");
        }
    }
}
