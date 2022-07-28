package com.example.restwithspring.service;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosService {

    @Autowired
    private TodosRepository todosRepository;

    public List<Todos> getAllTodos() {
        return todosRepository.findAll();
    }

    public Todos insertTodo(Todos todoToInsert) {
        return todosRepository.save(todoToInsert);
    }

}
