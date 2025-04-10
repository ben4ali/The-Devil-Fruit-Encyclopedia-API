package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;

public interface DevilFruitService {
    public Iterable<DevilFruit> getAllDevilFruits();
    public DevilFruit getDevilFruitById(Long id);
    public DevilFruit createDevilFruit(DevilFruit devilFruit);
    public DevilFruit updateDevilFruit(Long id);
    public void deleteDevilFruit(Long id);
}
