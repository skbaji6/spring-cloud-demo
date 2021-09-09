package com.samay.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samay.tech.model.Inventory;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode(String skuCode);
}
