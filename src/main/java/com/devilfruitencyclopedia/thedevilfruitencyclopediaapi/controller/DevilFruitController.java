package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.controller;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruitType;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service.implementation.DevilFruitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devilfruits")
public class DevilFruitController {

    @Autowired
    private DevilFruitServiceImpl devilFruitServiceImpl;

    //get all devil fruit
    @GetMapping
    public Iterable<DevilFruit> getAllDevilFruits() {
        return devilFruitServiceImpl.getAllDevilFruits();
    }

    //get devil fruit by id
    @GetMapping("/{id}")
    public DevilFruit getDevilFruitById(@PathVariable Long id) {
        return devilFruitServiceImpl.getDevilFruitById(id);
    }

    //create fruit
    @PostMapping
    public DevilFruit createDevilFruit(
            @RequestParam String name,
            @RequestParam DevilFruitType type,
            @RequestParam(required = false) String currentHolder,
            @RequestParam(required = false) String pastUsers,
            @RequestParam String description,
            @RequestParam String imageUrl) {

        DevilFruit devilFruit = new DevilFruit(name, type, currentHolder, pastUsers, description, imageUrl);
        return devilFruitServiceImpl.createDevilFruit(devilFruit);
    }

    //update fruit
    @PutMapping("/{id}")
    public DevilFruit updateDevilFruit(@PathVariable Long id, @RequestBody DevilFruit updatedDevilFruit) {
        DevilFruit existingDevilFruit = devilFruitServiceImpl.getDevilFruitById(id);
        if (existingDevilFruit != null) {
            updatedDevilFruit.setId(id);
            return devilFruitServiceImpl.createDevilFruit(updatedDevilFruit);
        }
        return null;
    }

    //delete fruit
    @DeleteMapping("/{id}")
    public void deleteDevilFruit(@PathVariable Long id) {
        devilFruitServiceImpl.deleteDevilFruit(id);
    }
}