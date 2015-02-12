/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.util;

import com.eyesore.engine.*;
import java.util.Calendar;

/**
 *
 * @author sora
 */
public class Time {
    String days[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesdey",
            "Thursday", "Friday" };
    Calendar cal;
    
    public Time(){
        cal = Calendar.getInstance();        
    }
    
    public String getToDay(){
        return days[cal.get(cal.DAY_OF_WEEK)];
    }
}
