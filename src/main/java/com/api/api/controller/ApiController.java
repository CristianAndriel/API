package com.api.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.api.api.ApiApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController //Indica que estamos definindo uma API dentro desta classe
public class ApiController {

    private List<String> task = new ArrayList<>(); //Cria uma lista de tarefas vazia

    private ObjectMapper objectMapper; //Cria um objeto ObjectMapper para converter objetos Java em JSON e vice-versa

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper; //Injeta o ObjectMapper no construtor da classe
    }



    @GetMapping(path = "/tasks")//Indica que o método abaixo é um endpoint de GET e a rota para acessar esse endpoint é "/tasks"
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(objectMapper.writeValueAsString(task)); //Retorna uma resposta HTTP 200 com o corpo "Hello, World!"

    }



}
