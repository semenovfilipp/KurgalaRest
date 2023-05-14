package org.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity // Обозначение для MySQL сущностей
@Table (name = "administrator")
public class AdministratorEntity {
    @Id
    @Column(name = "user_id")
    private Long UserID;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "status")
    private String status;

    @Column(name = "menu_id")
    private Integer menuID;
}
