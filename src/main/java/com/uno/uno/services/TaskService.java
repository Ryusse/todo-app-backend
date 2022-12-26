
package com.uno.uno.services;

import com.uno.uno.entities.Task;
import com.uno.uno.repository.TaskRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TaskService implements ITaskService {
    @Autowired
    private TaskRepository repository;
    
    @Override
    public List<Task> getTasks() {
        return (List<Task>) repository.findAll();
    }
    

}
