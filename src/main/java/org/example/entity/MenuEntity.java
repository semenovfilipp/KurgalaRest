package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table (name = "menu")
public class MenuEntity {
    @Id
    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "food_description") // Создание колонки в MySQL
    private String foodDescription;

    @Column(name = "price")
    private Integer price;

    @Column(name = "start_date")
    private OffsetDateTime startDate;

    @Column(name = "end_date")
    private OffsetDateTime endDate;
}
