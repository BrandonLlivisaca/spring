package com.service.app.domain.repository;

import com.service.app.domain.model.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getAll();
}
