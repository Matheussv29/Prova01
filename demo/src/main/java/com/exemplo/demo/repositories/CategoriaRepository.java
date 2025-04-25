package com.exemplo.demo.repositories;

import com.exemplo.demo.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
