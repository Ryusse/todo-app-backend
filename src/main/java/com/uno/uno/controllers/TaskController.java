package com.uno.uno.controllers;

import com.uno.uno.entities.Task;
import com.uno.uno.services.ITaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {
	
	@Autowired
	private ITaskService service;
	
	@GetMapping("/api/tasks")
	public List<Task> getTasks() {
		return service.getTasks();
	}
	
	@GetMapping("/api/task/{id}")
	public Task getById(@PathVariable String id) {
		return service.getById(Long.parseLong(id));
	}
	
	@DeleteMapping("/api/task/{id}")
	public void remove(@PathVariable String id) {
		service.remove(Long.parseLong(id));
	}
	
	@PostMapping("/api/task")
	public void save(@RequestBody Task task) {
		service.save(task);
	}
}
