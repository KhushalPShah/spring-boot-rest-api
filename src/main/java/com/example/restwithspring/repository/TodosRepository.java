package com.example.restwithspring.repository;

import com.example.restwithspring.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface TodosRepository extends JpaRepository<Todos, UUID> {
//    @Query("select t from Todos t where t.user.id = ?1")
//    List<Todos> findByUser_Id(Integer id);

}
