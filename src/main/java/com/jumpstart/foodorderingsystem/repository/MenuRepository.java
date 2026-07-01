package com.jumpstart.foodorderingsystem.repository;

import com.jumpstart.foodorderingsystem.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Menu entity.
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}