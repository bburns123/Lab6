/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author Brendyn Burns
 */
public class Month {
    int monthNumber;
    String[] monthName = {"n/a", "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    public int getMonthNumber() {
        return monthNumber;
    }
    
    public String[] getMonthName() {
        return monthName;
    }
    
    public Month() {
        int monthNumber = 1;
    }
    
    public Month(int inMonthNumber) {
        monthNumber = inMonthNumber;
        if (monthNumber < 1 || monthNumber > 12) {
            inMonthNumber = 1;
        }
    }
    public void setMonthNumber(int inMonthNumber) {
        monthNumber = inMonthNumber;
        if (monthNumber < 1 || monthNumber > 12) {
            inMonthNumber = 1;
        }
    }
    
    public void Month(String inMonthName) {
        monthNumber = inMonthName.indexOf(inMonthName);
    }
    
    public String toString() {
        return "The month name is: " + monthName[monthNumber] + "\n" + "The Month number is: " + monthNumber;
    }
    
    public boolean equalTo(Month inMonth, int input) {
        if (monthNumber == input) {
            return true;
        }
        return false;
    }
    
    public boolean greaterThan(Month inMonth, int input) {
        if (monthNumber > input) {
            return true;
        }
        return false;
    }
    
    public boolean lessThan(Month inMonth, int input) {
        if (monthNumber < input) {
            return true;
        }
        return false;
    }
}
