package com.jumpstart.foodorderingsystem.service;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(Long id);

    CategoryDto addCategory(CategoryDto dto);

    CategoryDto updateCategory(Long id, CategoryDto dto);

    void deleteCategory(Long id);
}