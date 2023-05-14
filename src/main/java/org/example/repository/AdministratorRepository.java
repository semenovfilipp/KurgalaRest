package org.example.repository;

import org.example.entity.AdministratorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

public interface AdministratorRepository extends CrudRepository <AdministratorEntity,Long> {



}
