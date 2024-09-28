package com.desafio.ToDoList.repositories;

import com.desafio.ToDoList.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo,Long> {
}
