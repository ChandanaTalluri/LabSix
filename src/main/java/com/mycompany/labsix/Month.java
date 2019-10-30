/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labsix;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Chandana
 */
public class Month {
    private int monthNumber;
    
    public Month(){
        this.monthNumber = 1;
    }
    public Month(int monthNumber){
        if(monthNumber<1 || monthNumber>12){
            this.monthNumber =1;
        }
        else{
            this.monthNumber = monthNumber;          
        }
    }
    public Month( String nameOfMonth){
        
        String monthNumber = null;
        MonthConstants objMonthConstants = new MonthConstants();
        HashMap hmplist = objMonthConstants.monthNameNum();
        Iterator hmpiterate = hmplist.entrySet().iterator();
        while(hmpiterate.hasNext()){
            Map.Entry map = (Map.Entry)hmpiterate.next(); 
            if(map.getValue().equals(nameOfMonth)){
                monthNumber = (String) map.getKey();
                setMonthNumber(Integer.parseInt(monthNumber));
            }
        }

    }
    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
         if(monthNumber<1 || monthNumber>12){
            this.monthNumber =1;
        }
        else{
            this.monthNumber = monthNumber;          
        }
    }
    public String getMonthName(){
        int monthNumber = this.monthNumber;
        String strMonthName = null;
        MonthConstants objMonthConstants = new MonthConstants();
        HashMap hmplist = objMonthConstants.monthNameNum();
        Iterator hmpiterate = hmplist.entrySet().iterator();
        while(hmpiterate.hasNext()){
            Map.Entry map = (Map.Entry)hmpiterate.next(); 
            if(map.getKey().equals(monthNumber)){
                strMonthName = (String) map.getValue();
            }
        }
        return strMonthName;
    }

    @Override
    public String toString() {
        return "MonthName " + getMonthName();
    }

    
    public boolean equals(Month objNewMonth) {
        boolean isEqual = false;
        if(this.monthNumber == objNewMonth.getMonthNumber()){
            isEqual = true;
        }else{
            isEqual = false;
        }
        return isEqual;
    }
    public boolean greaterThan(Month objNewMonth){
        boolean isGreater = false;
        if(this.monthNumber>objNewMonth.getMonthNumber()){
            isGreater = true;
        }else{
            isGreater = false;
        }
        return isGreater;
    }
    public boolean lessThan(Month objNewMonth){
        boolean isless = false;
        if(this.monthNumber<objNewMonth.getMonthNumber()){
            isless = true;
        }else{
            isless = false;
        }
        return isless;
    }
}
