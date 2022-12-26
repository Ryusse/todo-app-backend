package com.uno.uno.controllers;
import com.uno.uno.entities.Task;
import com.uno.uno.services.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private ITaskService service;

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        return service.getTasks();
    }

}
