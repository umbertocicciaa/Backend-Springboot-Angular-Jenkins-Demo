package com.jenkinsdeploy.jenkinsdeploy.services;

import com.jenkinsdeploy.jenkinsdeploy.models.TodosEntity;
import com.jenkinsdeploy.jenkinsdeploy.repositories.TodosRepositoryInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodosServices implements TodosServicesInterface {

    private final TodosRepositoryInterface todosRepository;

    @Override
    public List<TodosEntity> getTodos() {
        return todosRepository.findAll();
    }
}
