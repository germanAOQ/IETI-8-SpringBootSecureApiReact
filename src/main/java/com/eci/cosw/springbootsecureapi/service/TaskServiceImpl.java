package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Status;
import com.eci.cosw.springbootsecureapi.model.Task;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private ArrayList<Task> tasks = new ArrayList<Task>();

    @PostConstruct
    private void populateSampleData()
    {
        createTask(new Task(1, "Primera tarea", Status.Ready, "24-03-2021", "Germán Ospina"));
        createTask(new Task(2, "Segunda tarea", Status.Done, "24-03-2021", "Germán Ospina"));
        createTask(new Task(3, "Tercera tarea", Status.In_Progress, "24-03-2021", "Germán Ospina"));
        createTask(new Task(4, "Cuarta tarea", Status.Ready, "24-03-2021", "Germán Ospina"));
        createTask(new Task(5, "Quinta tarea", Status.In_Progress, "24-03-2021", "Germán Ospina"));
    }


    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public Task getTask(long id) {
        Task task = null;
        for(Task t: tasks){
            if(t.getId() == id){
                task = t;
            }
        }
        return task;
    }

    @Override
    public Task createTask(Task task) {
        long lastid = tasks.size();
        task.setId(lastid+1);
        tasks.add(task);
        return task;
    }

    @Override
    public Task findByTitle(String title) {
        Task task = null;
        for(Task t: tasks){
            if(t.getTitle().equals(title)){
                task = t;
            }
        }
        return task;
    }
}
