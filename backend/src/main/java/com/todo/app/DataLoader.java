package com.todo.app;

import com.todo.app.model.Todo;
import com.todo.app.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final TodoRepository repo;

    public DataLoader(TodoRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repo.count() == 0) {
            repo.save(new Todo(null, "Buy groceries", false, LocalDateTime.now()));
            repo.save(new Todo(null, "Read a book", false, LocalDateTime.now()));
            repo.save(new Todo(null, "Walk the dog", false, LocalDateTime.now()));
        }
    }
}
