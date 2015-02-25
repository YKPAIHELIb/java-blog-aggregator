package com.tarsan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsan.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
