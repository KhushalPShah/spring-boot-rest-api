package com.example.restwithspring.service;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.model.Users;
import com.example.restwithspring.repository.TodosRepository;
import com.example.restwithspring.repository.UsersRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class TodosService {

    @Autowired
    private TodosRepository todosRepository;

    @Autowired
    private UsersRepository usersRepository;


    public List<Todos> getAllTodos() {
        return todosRepository.findAll();
    }

    public Todos insertTodo(Todos todoToInsert) {
        return todosRepository.save(todoToInsert);
    }

    public List<Todos> findAllTodosForUser(Integer userId) {
         Optional<Users> userOpt = usersRepository.findById(userId);
         if(userOpt.isPresent()) {
             Users user = userOpt.get();
             return user.getTodos();
         }
         else {
             return null;
         }
    }

    public Users insertTodoForUser(Todos todoToInsert, Integer userID) {

        Optional<Users> userOpt = usersRepository.findById(userID);
        if(userOpt.isPresent()) {
            Users user = userOpt.get();

            List<Todos> savedTodos = user.getTodos();
            savedTodos.add(todoToInsert);
            user.setTodos(savedTodos);

            usersRepository.save(user);

            return user;
        }
        else {
            // todo :  throw a service exception here
            return null;
        }
    }

}
