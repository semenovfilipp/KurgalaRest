package org.example.repository;

import org.example.entity.FoodItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface FoodItemRepository extends CrudRepository <FoodItemEntity, Long> {

}
