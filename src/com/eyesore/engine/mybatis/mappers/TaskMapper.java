/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eyesore.engine.mybatis.mappers;

import com.eyesore.engine.mybatis.domain.Task;
import java.util.List;

/**
 *
 * @author sora
 */
public interface TaskMapper {
    List<Task> selectData();
    List<Task> selectTaskByDay(String day);
    void insertTask(Task task);
    void updateTask(boolean status, String task);
    void deleteTask(Task task);
}
