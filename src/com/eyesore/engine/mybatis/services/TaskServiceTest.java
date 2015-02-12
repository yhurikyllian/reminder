/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.services;

import com.eyesore.engine.mybatis.domain.Task;
import java.util.List;

/**
 *
 * @author sora
 */
public class TaskServiceTest {
    private static TaskService taskService;
    
    public TaskServiceTest(){
        taskService = new TaskService();
        testSelectData();
        testSelectTaskByDay();
        testAddTask();
    }
    
    public static void tearDown(){
        taskService = null;
    }
    
    private void testSelectData(){
        List<Task> tasks = taskService.selectData();
        for(Task task : tasks){
            System.out.println(task.getTask());
        }
        System.out.println("==========================");
    }
    
    private void testSelectTaskByDay(){
        List<Task> tasks = (List<Task>) taskService.selectTaskByDay("Friday");
        for(Task task : tasks){
            System.out.println(task.getTask());
        }
        System.out.println("==========================");
    }
    
    private void testAddTask(){
        Task task = new Task();
        task.setTask("kyu hyun");
        task.setDay("Friday");
        task.setRepeat(false);
        task.setStatus(true);
        taskService.addTask(task);
        List<Task> newTask = taskService.selectTaskByDay("Friday");
        for(Task tempTask : newTask){
            System.out.println(tempTask.getTask());
        }        
    }
    
    public static void main(String[] args) {
        new TaskServiceTest();
    }
}
