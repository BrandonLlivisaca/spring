package com.service.app.persistence.mapper;

import com.service.app.domain.model.Category;
import com.service.app.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "id", target = "idCategory"),
            @Mapping(source = "descripcion", target = "descripcionCategory"),
            @Mapping(source = "estado", target = "estadoCategory")
    })

    Category toCategory(Categoria categoria);
    List<Category> toCategorias(List<Categoria> categorias);

    @InheritInverseConfiguration
    Categoria toCategoria(Category category);


}
