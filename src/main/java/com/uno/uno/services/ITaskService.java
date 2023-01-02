package com.uno.uno.services;

import com.uno.uno.entities.Task;
import java.util.List;

public interface ITaskService {
	List<Task> getTasks();
	
	Task getById(Long id);
	
	void remove(Long id);
	
	void save(Task task);
}
