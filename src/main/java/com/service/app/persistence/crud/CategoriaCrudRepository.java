package com.service.app.persistence.crud;

import com.service.app.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Long> {

}
