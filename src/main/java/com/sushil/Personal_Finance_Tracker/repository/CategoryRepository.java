package com.sushil.Personal_Finance_Tracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sushil.Personal_Finance_Tracker.entity.Category;
import com.sushil.Personal_Finance_Tracker.entity.User;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByUserIsNullOrUser(User user);
    boolean existsByNameAndUser(String name, User user);
    boolean existsByNameAndUserIsNull(String name);
}