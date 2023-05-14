package org.example.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Spring поонимает что здесь находяться сущности для базы данных
@Table(name = "food_item") // Создание таблицы для передачи в MySQL

public class FoodItemEntity {
    @Id
    @Column(name = "food_id") // Создание колонки в MySQL
    private Long foodId;

    @Column(name = "food_name") // Создание колонки в MySQL
    private String foodName;

    @Column(name = "food_categoty") // Создание колонки в MySQL
    private String foodCategory;

    @Column(name = "weight") // Создание колонки в MySQL
    private Integer weight;

    @Column(name = "unit_price") // Создание колонки в MySQL
    private Integer unitPrice;
}
