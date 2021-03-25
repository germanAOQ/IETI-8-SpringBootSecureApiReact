package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.google.gson.Gson;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public String getTasks(){
        return new Gson().toJson(taskService.getTasks());
    }

    @PostMapping("/task")
    public ResponseEntity<?> newTask(@RequestBody Task newTask){
        taskService.createTask(newTask);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
