package com.tarsan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarsan.entity.Blog;
import com.tarsan.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);
}
