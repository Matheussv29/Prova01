package com.exemplo.demo.controllers;

import com.exemplo.demo.entities.Categoria;
import com.exemplo.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @GetMapping
    public List<Categoria> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return repository.save(categoria);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id, @RequestBody Categoria categoriaAtualizada) {
        categoriaAtualizada.setId(id);
        return repository.save(categoriaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
