package com.microservice.productos.controller;
import com.microservice.productos.entity.Categoria;
import com.microservice.productos.service.ICategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor
public class CategoriaController {
    private final ICategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.getAllCategoria();
    }

    @GetMapping("/{id}")
    public Categoria obtenerCategoria(@PathVariable Long id) {
        return categoriaService.getCategoria(id);
        //   .orElseThrow(() -> new RuntimeException("Categoria no encontrado con id: " + id))
    }

    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizarCategoria(@RequestBody Categoria categoriaActualizado) {
        return categoriaService.updateCategoria(categoriaActualizado);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
    }

}



