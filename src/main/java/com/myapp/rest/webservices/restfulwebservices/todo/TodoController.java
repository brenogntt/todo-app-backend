package com.myapp.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping(path="/users/{username}/todos/{id}")
    public Todo getAllTodos(@PathVariable  String username, @PathVariable Long id){
        return todoHardCodedService.findById(id);
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

    @PutMapping(path="/users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(
            @PathVariable String username,
            @PathVariable long id,
            @RequestBody Todo todo){
        Todo todoUpdated = todoHardCodedService.save(todo);
        return new ResponseEntity<Todo>(todoUpdated,HttpStatus.OK);
    }
}
