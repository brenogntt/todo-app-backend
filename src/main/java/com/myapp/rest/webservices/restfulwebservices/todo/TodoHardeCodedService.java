package com.myapp.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoHardeCodedService {

    private static List<Todo> todos = new ArrayList();
    private static long idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "breno.gianotto", "Task one", new Date(), false));
        todos.add(new Todo(++idCounter, "breno.gianotto", "Task two", new Date(), false));
        todos.add(new Todo(++idCounter, "breno.gianotto", "Task three", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo save (Todo todo){
        if(todo.getId() == null){
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
    return todo;
    }

    public Todo deleteById(long id){
        Todo todo = findById(id);

        if(todo != null){
            todos.remove(todo);
            return todo;
        } else return null;
    }

    public Todo findById(long id) {
        for(Todo todo:todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
