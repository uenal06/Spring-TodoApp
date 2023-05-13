package com.pvsspring.demo.controller;

import com.pvsspring.demo.model.ToDo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ToDoController {

    List<ToDo> list = new ArrayList<>();



    @GetMapping("/")
    String Greeting() {
        return "Hello from Spring";
    }

    @PostMapping("/todo")
    String newTodo(@RequestBody ToDo newTodo) {
        list.add(newTodo);
        return newTodo.toString() + " Successfully created new Todo";
    }

    @GetMapping("/todos")
    String getAllTodos() {
        String x = new String();
        for (ToDo item : list) {
            x=x+item.toString()+"\n";

        }
        return x;
    }

    @GetMapping("/todo/{id}")
    String getTodoById(@PathVariable Long id) {
        for (ToDo item : list) {
            if (item.getToDoId() == id) {
                return item.toString();
            }
        }
        return "Not Found";
    }

    @PutMapping("/todo/{id}")
    String updateTodo(@RequestBody ToDo newTodo, @PathVariable Long id) {
        for (ToDo item : list) {
            if (item.getToDoId() == id) {
                item.setTask(newTodo.getTask());
                item.setDescription(newTodo.getDescription());
                item.setPerson(newTodo.getPerson());
                item.setPriority(newTodo.getPriority());
                return item.toString();
            }
        }

        return "Not Found";

    }

    @DeleteMapping("/todo/{id}")
    String deleteUser(@PathVariable Long id) {
        for (ToDo item : list) {
            if (item.getToDoId() == id) {
                list.remove(item);
                return item.toString() + "Deleted";
            }
        }
        return "Todo Not Found";
    }


}
