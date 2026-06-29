package com.jumpstart.foodorderingsystem.service;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import com.jumpstart.foodorderingsystem.entity.Category;
import com.jumpstart.foodorderingsystem.exception.CategoryNotFoundException;
import com.jumpstart.foodorderingsystem.repository.CategoryRepository;
import org.springframework.stereotype.Service;

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

    /**
     * Get all categories.
     */
    @Override
    public List<CategoryDto> getAllCategories() {

        List<Category> categories = categoryRepository.findAll();

        return categories.stream()
                .map(cat -> new CategoryDto(
                        cat.getId(),
                        cat.getName()))
                .collect(Collectors.toList());
    }

    /**
     * Get category by ID.
     */
    @Override
    public CategoryDto getCategoryById(Long id) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new CategoryNotFoundException(
                                "Category not found with id: " + id));

        return new CategoryDto(
                category.getId(),
                category.getName());
    }

    /**
     * Create a new category.
     */
    @Override
    public CategoryDto addCategory(CategoryDto dto) {

        Category category = new Category();
        category.setName(dto.getName());

        Category savedCategory =
                categoryRepository.save(category);

        return new CategoryDto(
                savedCategory.getId(),
                savedCategory.getName());
    }

    /**
     * Update an existing category.
     */
    @Override
    public CategoryDto updateCategory(Long id, CategoryDto dto) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new CategoryNotFoundException(
                                "Category not found with id: " + id));

        category.setName(dto.getName());

        Category updatedCategory =
                categoryRepository.save(category);

        return new CategoryDto(
                updatedCategory.getId(),
                updatedCategory.getName());
    }

    /**
     * Delete a category.
     */
    @Override
    public void deleteCategory(Long id) {

        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new CategoryNotFoundException(
                                "Category not found with id: " + id));

        categoryRepository.delete(category);
    }
}