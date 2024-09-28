package com.desafio.ToDoList.services;

import com.desafio.ToDoList.entities.ToDo;
import com.desafio.ToDoList.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository repository;

    public List<ToDo> create(ToDo todo){
        repository.save(todo);
        return list();
    }
    public List<ToDo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return repository.findAll(sort);
    }
    public List<ToDo> update(ToDo todo){
        repository.save(todo);
        return list();
    }
    public List<ToDo> delete(Long id){
        repository.deleteById(id);
        return list();
    }
}
