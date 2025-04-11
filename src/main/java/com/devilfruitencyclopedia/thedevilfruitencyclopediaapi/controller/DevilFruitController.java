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
            @RequestParam String originalName,
            @RequestParam String romanizedName,
            @RequestParam String englishName,
            @RequestParam DevilFruitType type,
            @RequestParam String debutChapter,
            @RequestParam String debutEpisode,
            @RequestParam String debutArc,
            @RequestParam(required = false) String currentHolder,
            @RequestParam(required = false) String pastHolders,
            @RequestParam String description,
            @RequestParam boolean awakeningStatus,
            @RequestParam(required = false) String awakeningDescription,
            @RequestParam boolean isCanon,
            @RequestParam String imageUrl) {

        DevilFruit devilFruit = new DevilFruit(
                originalName,
                romanizedName,
                englishName,
                type,
                debutChapter,
                debutEpisode,
                debutArc,
                currentHolder,
                pastHolders,
                description,
                awakeningStatus,
                awakeningDescription,
                isCanon,
                imageUrl
        );
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