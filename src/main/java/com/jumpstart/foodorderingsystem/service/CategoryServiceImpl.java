package com.jumpstart.foodorderingsystem.service;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import com.jumpstart.foodorderingsystem.entity.Category;
import com.jumpstart.foodorderingsystem.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import com.jumpstart.foodorderingsystem.exception.CategoryNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service layer handles business logic for Category.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();

        return categories.stream()
                .map(cat -> new CategoryDto(cat.getId(), cat.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDto getCategoryById(Long id) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new CategoryNotFoundException(
                                "Category not found with id: " + id));

        CategoryDto dto = new CategoryDto();
        dto.setId(category.getId());
        dto.setName(category.getName());

        return dto;
    }
}