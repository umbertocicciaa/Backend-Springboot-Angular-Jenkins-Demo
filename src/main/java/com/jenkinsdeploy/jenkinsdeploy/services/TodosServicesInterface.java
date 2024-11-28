package com.jenkinsdeploy.jenkinsdeploy.services;

import com.jenkinsdeploy.jenkinsdeploy.models.TodosEntity;

import java.util.List;

public interface TodosServicesInterface {
    List<TodosEntity> getTodos();
}
