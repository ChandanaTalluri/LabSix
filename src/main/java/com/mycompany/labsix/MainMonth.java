/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labsix;

/**
 *
 * @author Chandana
 */
public class MainMonth {
    public static void main(String[] args) {
        int monthNumber = 4;
        Month objMonth = new Month(monthNumber);
        String strMonthName = objMonth.getMonthName();
        System.out.println("Month Name is : "+strMonthName);
        
    }
}
