package com.innoit.todoapplication.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.innoit.todoapplication.api.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
