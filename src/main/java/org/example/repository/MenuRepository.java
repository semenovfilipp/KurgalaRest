package org.example.repository;

import org.example.entity.MenuEntity;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<MenuEntity, Long> {

}
