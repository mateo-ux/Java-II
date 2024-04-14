package com.microservice.productos.service;
import com.microservice.productos.entity.Categoria;
import java.util.List;

public interface ICategoriaService {
    public Categoria getCategoria(Long id);
    public List<Categoria> getAllCategoria();
    public Categoria saveCategoria(Categoria categoria);
    public Categoria updateCategoria(Categoria categoria);
    public void deleteCategoria(Long id);

}
