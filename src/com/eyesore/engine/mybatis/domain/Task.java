/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.domain;

import com.eyesore.engine.*;

/**
 *
 * @author sora
 */
public class Task {
    private String TASK;
    private String DAY;
    private boolean REPEAT;
    private boolean STATUS;
    
    public Task(){
        TASK = "";
        DAY = "";
        REPEAT = false;
        STATUS = false;
    }
    
    public String getTask(){
        return TASK;
    }
    public String getDay(){
        return DAY;
    }
    public boolean getRepeat(){
        return REPEAT;
    }
    public boolean getStatus(){
        return STATUS;
    }
    public void setTask(String task){
        this.TASK = task;
    }
    public void setDay(String day){
        this.DAY = day;
    }
    public void setRepeat(boolean repeat){
        this.REPEAT = repeat;
    }
    public void setStatus(boolean status){
        this.STATUS = status;
    }
}
