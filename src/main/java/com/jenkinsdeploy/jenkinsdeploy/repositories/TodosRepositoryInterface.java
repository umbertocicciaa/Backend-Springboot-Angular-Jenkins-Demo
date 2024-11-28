package com.jenkinsdeploy.jenkinsdeploy.repositories;

import com.jenkinsdeploy.jenkinsdeploy.models.TodosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepositoryInterface extends JpaRepository<TodosEntity, Integer> {
}
