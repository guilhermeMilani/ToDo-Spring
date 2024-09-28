package com.desafio.ToDoList.controllers;

import com.desafio.ToDoList.entities.ToDo;
import com.desafio.ToDoList.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
    private ToDoService service;
    @PostMapping
    public List<ToDo> create(@RequestBody ToDo todo){
        return service.create(todo);
    }
    @GetMapping
    public List<ToDo> list(){
        return service.list();
    }
    @PutMapping
    public List<ToDo> update(@RequestBody ToDo todo){
        return service.update(todo);
    }
    @DeleteMapping("{id}")
    public List<ToDo> delete(@PathVariable("id") Long id){
        return service.delete(id);
    }
}
