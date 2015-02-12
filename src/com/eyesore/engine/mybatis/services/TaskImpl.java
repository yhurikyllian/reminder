/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.services;

import com.eyesore.engine.mybatis.domain.Task;
import com.eyesore.engine.mybatis.util.Time;
import java.util.List;
import javax.swing.JList;

/**
 *
 * @author sora
 */
public class TaskImpl {
    private Time time;
    private static TaskService taskService;
    private List<Task> tasks;
    private Task task;
    
    public TaskImpl(){
        time = new Time();
        taskService = new TaskService();
    }
    
    private void initTasks(){
        tasks = (List<Task>) taskService.selectTaskByDay(time.getToDay());
    }
    
    public void displayTask(JList lstTask){        
        initTasks();
        String[] tempTask = new String[tasks.size()];
        int i = 0;
        for(Task task : tasks){            
            tempTask[i] = task.getTask();
            i++;
        }
        lstTask.setListData(tempTask);
    }
    
    public Task getSelectedTask(int selectedIndex){
        task = tasks.get(selectedIndex);
        return task;
    }
    
    public static void tearDown(){
        taskService = null;
    }
    
    public void updateTask(String task, boolean status){
        taskService.updateTask(status, task);
    }
    
    public void addTask(String nameTask, String day, boolean isRepeat, boolean status){
        task = new Task();
        task.setTask(nameTask);
        task.setDay(day);
        task.setRepeat(isRepeat);
        task.setStatus(status);
        taskService.addTask(task);
    }
    
    public void deleteTask(){
        taskService.deleteTask(task);
    }
}
