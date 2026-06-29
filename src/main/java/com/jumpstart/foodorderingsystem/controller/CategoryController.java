package com.jumpstart.foodorderingsystem.controller;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import com.jumpstart.foodorderingsystem.response.Response;
import com.jumpstart.foodorderingsystem.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller responsible for handling Category APIs.
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /**
     * GET all categories
     */
    @GetMapping
    public ResponseEntity<Response<List<CategoryDto>>> getAllCategories() {

        List<CategoryDto> categories = categoryService.getAllCategories();

        return ResponseEntity.ok(
                Response.success("Categories retrieved", categories)
        );
    }

    /**
     * GET category by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<Response<CategoryDto>> getCategoryById(@PathVariable Long id) {

        CategoryDto dto = categoryService.getCategoryById(id);

        return ResponseEntity.ok(
                Response.success("Category retrieved", dto)
        );
    }

    /**
     * CREATE category
     */
    @PostMapping
    public ResponseEntity<Response<CategoryDto>> addCategory(
            @RequestBody @Valid CategoryDto dto) {

        CategoryDto created = categoryService.addCategory(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Response.success("Category created", created));
    }

    /**
     * UPDATE category
     */
    @PutMapping("/{id}")
    public ResponseEntity<Response<CategoryDto>> updateCategory(
            @PathVariable Long id,
            @RequestBody @Valid CategoryDto dto) {

        CategoryDto updated = categoryService.updateCategory(id, dto);

        return ResponseEntity.ok(
                Response.success("Category updated", updated)
        );
    }

    /**
     * DELETE category
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Response<Void>> deleteCategory(@PathVariable Long id) {

        categoryService.deleteCategory(id);

        return ResponseEntity.ok(
                Response.success("Category deleted", null)
        );
    }
}