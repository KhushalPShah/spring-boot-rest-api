package com.example.restwithspring.service;

import com.example.restwithspring.model.Todos;
import com.example.restwithspring.model.Users;
import com.example.restwithspring.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    public Users insertUser(Users userToInsert) {
       return usersRepository.save(userToInsert);
    }

}
