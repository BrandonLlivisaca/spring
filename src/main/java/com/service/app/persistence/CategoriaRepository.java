package com.service.app.persistence;

import com.service.app.domain.model.Category;
import com.service.app.domain.repository.CategoryRepository;
import com.service.app.persistence.crud.CategoriaCrudRepository;
import com.service.app.persistence.entity.Categoria;
import com.service.app.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaRepository implements CategoryRepository {
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;
    @Autowired
    private CategoryMapper mapper;

    @Override
    public List<Category> getAll(){
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return mapper.toCategorias(categorias);
    }
}
