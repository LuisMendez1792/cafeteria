package com.ajolotito.cafeteria.repository;

import com.ajolotito.cafeteria.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeteriaRepository extends JpaRepository<Producto, Long> {
}
