package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.domain.Category;

// Pode fazer todas as ações de no banco referente a um dominio
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
