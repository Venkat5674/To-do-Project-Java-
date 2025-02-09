package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.TodoService;

@Controller
public class TodoController {

    @Autowired
    private TodoService service;

    // This method serves the index view and adds todos to the model
    @GetMapping("/")
    public String index(Model model) {
        // Fetch the list of todos and add them to the model
        model.addAttribute("todos", service.getAllTodos());
        
        // Return the view name (index.html)
        return "index";
    }
}
