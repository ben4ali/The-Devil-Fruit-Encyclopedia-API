package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.controller;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruitType;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service.Implementation.DevilFruitServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devilfruits")
public class DevilFruitController {

    @Autowired
    private DevilFruitServiceImplementation devilFruitServiceImplementation;

    //get all devil fruit
    @GetMapping
    public Iterable<DevilFruit> getAllDevilFruits() {
        return devilFruitServiceImplementation.getAllDevilFruits();
    }

    //get devil fruit by id
    @GetMapping("/{id}")
    public DevilFruit getDevilFruitById(@PathVariable Long id) {
        return devilFruitServiceImplementation.getDevilFruitById(id);
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
        return devilFruitServiceImplementation.createDevilFruit(devilFruit);
    }

    //update fruit
    @PutMapping("/{id}")
    public DevilFruit updateDevilFruit(@PathVariable Long id, @RequestBody DevilFruit updatedDevilFruit) {
        DevilFruit existingDevilFruit = devilFruitServiceImplementation.getDevilFruitById(id);
        if (existingDevilFruit != null) {
            updatedDevilFruit.setId(id);
            return devilFruitServiceImplementation.createDevilFruit(updatedDevilFruit);
        }
        return null;
    }

    //delete fruit
    @DeleteMapping("/{id}")
    public void deleteDevilFruit(@PathVariable Long id) {
        devilFruitServiceImplementation.deleteDevilFruit(id);
    }
}