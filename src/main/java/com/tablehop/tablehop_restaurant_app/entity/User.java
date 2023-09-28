package com.tablehop.tablehop_restaurant_app.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userentity")
@DynamicInsert
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "username")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private String phone_no;

    @Column(name = "address")
    private String address;

    public User(String userName, String email, String phone_no, String address) {
        this.userName = userName;
        this.email = email;
        this.phone_no = phone_no;
        this.address = address;
    }

    public User() {

    }
}