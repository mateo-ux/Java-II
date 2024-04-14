package com.microservice.productos.service;

import com.microservice.productos.entity.Categoria;
import com.microservice.productos.repository.CategoriaRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService implements ICategoriaService {

    private final CategoriaRepository categoriaRepository;
    @Override
    public Categoria getCategoria(Long id) {
        return categoriaRepository.getReferenceById(id);
    }

    @Override
    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria updateCategoria(Categoria categoria) {
        Categoria c=  categoriaRepository.getReferenceById(categoria.getId());
        c.setId(categoria.getId());
        c.setNombre(categoria.getNombre());

        if (c==null){
            return null;
        } else{
            return categoriaRepository.save(categoria);
        }

    }

    @Override
    public void deleteCategoria(Long id) {

    }
}