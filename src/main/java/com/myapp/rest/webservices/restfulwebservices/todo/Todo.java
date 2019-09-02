package com.myapp.rest.webservices.restfulwebservices.todo;

import java.util.Date;

public class Todo {

    public Todo(Long id, String username, String description, Date deadLineDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.deadLineDate = deadLineDate;
        this.isDone = isDone;
    }

    private Long id;
    private String username;
    private String description;
    private Date deadLineDate;
    private boolean isDone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsarname() {
        return username;
    }

    public void setUsarname(String usarname) {
        this.username = usarname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(Date deadLineDate) {
        this.deadLineDate = deadLineDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
