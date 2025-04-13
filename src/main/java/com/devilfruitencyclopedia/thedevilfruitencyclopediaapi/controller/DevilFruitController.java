package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.controller;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service.implementation.DevilFruitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devilfruits")
public class DevilFruitController {

    @Autowired
    private DevilFruitServiceImpl devilFruitServiceImpl;

    // Get all devil fruits
    @GetMapping
    public Iterable<DevilFruit> getAllDevilFruits() {
        return devilFruitServiceImpl.getAllDevilFruits();
    }

    // Get devil fruit by ID
    @GetMapping("/{id}")
    public DevilFruit getDevilFruitById(@PathVariable Long id) {
        return devilFruitServiceImpl.getDevilFruitById(id);
    }

    @PostMapping
    public List<DevilFruit> createDevilFruits(@RequestBody List<DevilFruit> devilFruits) {
        return devilFruits.stream()
                .map(devilFruitServiceImpl::createDevilFruit)
                .toList();
    }

    // Update an existing devil fruit
    @PutMapping("/{id}")
    public DevilFruit updateDevilFruit(@PathVariable Long id, @RequestBody DevilFruit updatedDevilFruit) {
        DevilFruit existingDevilFruit = devilFruitServiceImpl.getDevilFruitById(id);
        if (existingDevilFruit != null) {
            updatedDevilFruit.setId(id);
            return devilFruitServiceImpl.createDevilFruit(updatedDevilFruit);
        }
        return null;
    }

    // Delete a devil fruit
    @DeleteMapping("/{id}")
    public void deleteDevilFruit(@PathVariable Long id) {
        devilFruitServiceImpl.deleteDevilFruit(id);
    }
}