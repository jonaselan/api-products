package com.example.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.domain.Product;

// Pode fazer todas as ações de no banco referente a um dominio
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
