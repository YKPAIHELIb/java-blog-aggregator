package com.tarsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsan.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
