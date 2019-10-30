/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labsix;

import java.util.HashMap;

/**
 *
 * @author Chandana
 */
public class MonthConstants {
    
    public final String STR_JANUARY = "JANUARY";
    public final String STR_FEBRUARY = "FEBRUARY";
    public final String STR_MARCH = "MARCH";
    public final String STR_APRIL = "APRIL";
    public final String STR_MAY = "MAY";
    public final String STR_JUNE = "JUNE";
    public final String STR_JULY = "JULY";
    public final String STR_AUGUST = "AUGUST";
    public final String STR_SEPTEMBER = "SEPTEMBER";
    public final String STR_OCTOBER = "OCTOBER";
    public final String STR_NOVEMBER = "NOVEMBER";
    public final String STR_DECEMBER = "DECEMBER";
    
    public HashMap monthNameNum(){
        HashMap hmpName = new HashMap();
       
            hmpName.put(1, STR_JANUARY);
            hmpName.put(2, STR_FEBRUARY);
            hmpName.put(3, STR_MARCH);
            hmpName.put(4, STR_APRIL);
            hmpName.put(5, STR_MAY);
            hmpName.put(6, STR_JUNE);
            hmpName.put(7, STR_JULY);
            hmpName.put(8, STR_AUGUST);
            hmpName.put(9, STR_SEPTEMBER);
            hmpName.put(10, STR_OCTOBER);
            hmpName.put(11, STR_NOVEMBER);
            hmpName.put(12, STR_DECEMBER);
        
        return hmpName;
    }
}
