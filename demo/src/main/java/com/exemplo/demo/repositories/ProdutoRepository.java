package com.exemplo.demo.repositories;

import com.exemplo.demo.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
