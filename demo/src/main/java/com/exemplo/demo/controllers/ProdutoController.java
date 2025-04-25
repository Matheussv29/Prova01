package com.exemplo.demo.controllers;

import com.exemplo.demo.entities.Produto;
import com.exemplo.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return repository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
        produtoAtualizado.setId(id);
        return repository.save(produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
