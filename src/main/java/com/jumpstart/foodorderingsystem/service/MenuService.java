package com.jumpstart.foodorderingsystem.service;

import com.jumpstart.foodorderingsystem.dto.MenuDto;
import com.jumpstart.foodorderingsystem.response.Response;
import java.util.List;

public interface MenuService {

    Response<MenuDto> createMenu(MenuDto dto);

    Response<List<MenuDto>> getAllMenus();

    Response<MenuDto> getMenuById(Long id);
}