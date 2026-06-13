package com.jumpstart.foodorderingsystem.controller;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import com.jumpstart.foodorderingsystem.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller exposing category endpoints.
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
}