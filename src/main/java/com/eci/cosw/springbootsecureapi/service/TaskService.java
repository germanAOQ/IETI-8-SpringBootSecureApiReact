package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();

    Task getTask(long id);

    Task createTask(Task task);

    Task findByTitle(String title);

}
