package com.jenkinsdeploy.jenkinsdeploy.controllers;

import com.jenkinsdeploy.jenkinsdeploy.services.TodosServicesInterface;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/"+"todo")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class TodosRestController {

    private final TodosServicesInterface todosServices;

    @GetMapping(value = "/todos")
    public ResponseEntity<?> getTodos() {
        return ResponseEntity.ok(todosServices.getTodos());
    }

}
