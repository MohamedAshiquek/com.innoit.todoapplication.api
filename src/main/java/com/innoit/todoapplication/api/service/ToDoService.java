package com.innoit.todoapplication.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.innoit.todoapplication.api.model.ToDo;
import com.innoit.todoapplication.api.repository.ToDoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public ToDo saveToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }

    public ToDo updateToDo(Long id, ToDo toDoDetails) {
        Optional<ToDo> optionalToDo = toDoRepository.findById(id);
        if (optionalToDo.isPresent()) {
            ToDo toDo = optionalToDo.get();
            toDo.setTitle(toDoDetails.getTitle());
            toDo.setCompleted(toDoDetails.isCompleted());
            return toDoRepository.save(toDo);
        }
        return null;
   }
}
