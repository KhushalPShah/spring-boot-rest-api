package com.example.restwithspring.controller;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.model.Users;
import com.example.restwithspring.service.TodosService;
import com.example.restwithspring.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/users")

public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private TodosService todosService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Users createNewUser(@RequestBody Users userToInsert) {
        return usersService.insertUser(userToInsert);
    }

    @RequestMapping(value = "/{id}/todo", method = RequestMethod.POST)
    public Users createNewTodo(@PathVariable(value = "id") Integer userId, @RequestBody Todos todoToInsert) {
        return todosService.insertTodoForUser(todoToInsert, userId);
    }

    @RequestMapping(value = "/{user_id}/todo", method = RequestMethod.GET)
    public List<Todos> getTodos(@PathVariable(value = "user_id") Integer userId) {
        return todosService.findAllTodosForUser(userId);
    }


}
