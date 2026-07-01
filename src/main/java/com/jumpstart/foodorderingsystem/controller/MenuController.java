package com.jumpstart.foodorderingsystem.controller;

import com.jumpstart.foodorderingsystem.dto.MenuDto;
import com.jumpstart.foodorderingsystem.response.Response;
import com.jumpstart.foodorderingsystem.service.MenuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @PostMapping
    public ResponseEntity<Response<MenuDto>> create(
            @RequestBody @Valid MenuDto dto) {

        return ResponseEntity.ok(
                menuService.createMenu(dto)
        );
    }

    @GetMapping
    public ResponseEntity<Response<List<MenuDto>>> all() {

        return ResponseEntity.ok(
                menuService.getAllMenus()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<MenuDto>> byId(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                menuService.getMenuById(id)
        );
    }
}