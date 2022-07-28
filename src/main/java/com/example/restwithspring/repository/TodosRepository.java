package com.example.restwithspring.repository;

import com.example.restwithspring.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodosRepository extends JpaRepository<Todos, UUID> {
}
