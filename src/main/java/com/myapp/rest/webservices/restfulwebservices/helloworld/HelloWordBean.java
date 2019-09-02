package com.myapp.rest.webservices.restfulwebservices.helloworld;

public class HelloWordBean {

    private String message;

    HelloWordBean(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWordBean{" + "message='" + message + '\'' + '}';
    }
}

