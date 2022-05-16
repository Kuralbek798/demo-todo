package com.example.repo;

import com.example.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // поиск категорий пользователя (по названию)
    List<Category> findByUserEmailOrderByTitleAsc(String email);
}
