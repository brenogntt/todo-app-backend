package com.myapp.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    @Autowired
    public TodoHardeCodedService todoHardCodedService;

    @GetMapping(path="/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable  String username){
        return todoHardCodedService.findAll();
    }

    @DeleteMapping(path="/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        Todo todo =  todoHardCodedService.deleteById(id);

        if(todo != null){
            return ResponseEntity.noContent().build();
        } else{
            return ResponseEntity.notFound().build();
        }
    }
}
