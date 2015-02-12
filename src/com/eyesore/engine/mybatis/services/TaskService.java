/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.services;

import com.eyesore.engine.mybatis.domain.Task;
import com.eyesore.engine.mybatis.mappers.TaskMapper;
import com.eyesore.engine.mybatis.util.MyBatisSqlSessionFactory;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author sora
 */
public class TaskService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    public List<Task> selectData(){
        SqlSession sqlSession = new MyBatisSqlSessionFactory().openSession();
        try{            
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            return taskMapper.selectData();
        } finally{
            sqlSession.close();
        }        
    }
    
    public List<Task> selectTaskByDay(String day){
        logger.debug("Select Task By Day : {}", day);
        SqlSession sqlSession = new MyBatisSqlSessionFactory().openSession();
        try{
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            return taskMapper.selectTaskByDay(day);
        } finally{
            sqlSession.close();
        }
    }
    
    public void addTask(Task task){
        SqlSession sqlSession = new MyBatisSqlSessionFactory().openSession();
        try{
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            taskMapper.insertTask(task);
            sqlSession.commit();
        } finally{
            sqlSession.close();
        }
    }
    
    public void updateTask(boolean status, String task){
        SqlSession sqlSession = new MyBatisSqlSessionFactory().openSession();
        try{
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            taskMapper.updateTask(status, task);
            sqlSession.commit();
        } finally{
            sqlSession.close();
        }
    }
    
    public void deleteTask(Task task){
        SqlSession sqlSession = new MyBatisSqlSessionFactory().openSession();
        try{
            TaskMapper taskMapper = sqlSession.getMapper(TaskMapper.class);
            taskMapper.deleteTask(task);
            sqlSession.commit();
        } finally{
            sqlSession.close();
        }
    }
}
