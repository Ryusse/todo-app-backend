
package com.uno.uno.repository;
import org.springframework.data.repository.CrudRepository;
import com.uno.uno.entities.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
