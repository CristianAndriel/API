package com.api.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Indica que estamos definindo uma API dentro desta classe
public class ApiController {

    private final List<String> task = new ArrayList<>(); //Cria uma lista de tarefas vazia

    @GetMapping(path = "/tasks")//Indica que o método abaixo é um endpoint de GET e a rota para acessar esse endpoint é "/tasks"
    public ResponseEntity<List<String>> getTasks() {
        return ResponseEntity.ok(task); //Retorna uma resposta HTTP 200 com a lista de tarefas em JSON
    }

    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String newTask) {
        task.add(newTask);
        return ResponseEntity.ok().build(); //Retorna uma resposta HTTP 200 sem corpo
    }
}
