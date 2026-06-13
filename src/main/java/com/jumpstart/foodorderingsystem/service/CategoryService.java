package com.jumpstart.foodorderingsystem.service;

import com.jumpstart.foodorderingsystem.dto.CategoryDto;
import java.util.List;

/**
 * Defines business operations for Category.
 */
public interface CategoryService {
    List<CategoryDto> getAllCategories();
}