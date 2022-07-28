package com.example.restwithspring.controller;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodosController {

    @Autowired
    private TodosService todosService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Todos> getAllTodos() {
        return todosService.getAllTodos();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Todos createNewTodo(@RequestBody Todos todoToInsert) {
        return todosService.insertTodo(todoToInsert);
    }

}
