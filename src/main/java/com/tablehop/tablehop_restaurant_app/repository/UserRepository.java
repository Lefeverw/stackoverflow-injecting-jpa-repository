package com.tablehop.tablehop_restaurant_app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tablehop.tablehop_restaurant_app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}