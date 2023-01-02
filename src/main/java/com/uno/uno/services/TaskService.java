package com.uno.uno.services;

import com.uno.uno.entities.Task;
import com.uno.uno.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {
	@Autowired
	private TaskRepository repository;
	
	@Override
	public List<Task> getTasks() {
		return (List<Task>) repository.findAll();
	}
	
	@Override
	public Task getById(Long id) {
		return repository.findById(id).get();
	}
	
	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}
	
	@Override
	public void save(Task customer) {
		repository.save(customer);
	}
	
	
}
