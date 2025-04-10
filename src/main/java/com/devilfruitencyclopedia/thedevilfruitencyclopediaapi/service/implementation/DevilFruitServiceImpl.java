package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service.implementation;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.repository.DevilFruitRepository;
import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.service.DevilFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevilFruitServiceImpl implements DevilFruitService {

    @Autowired
    private DevilFruitRepository devilFruitRepository;


    @Override
    public Iterable<DevilFruit> getAllDevilFruits() {
        return devilFruitRepository.findAll();
    }

    @Override
    public DevilFruit getDevilFruitById(Long id) {
        return devilFruitRepository.findById(id).orElse(null);
    }

    @Override
    public DevilFruit createDevilFruit(DevilFruit devilFruit) {
        return devilFruitRepository.save(devilFruit);
    }

    @Override
    public DevilFruit updateDevilFruit(Long id) {
        if (devilFruitRepository.existsById(id)) {
            DevilFruit devilFruit = devilFruitRepository.findById(id).orElse(null);
            return devilFruitRepository.save(devilFruit);
        } else {
            return null;
        }
    }

    @Override
    public void deleteDevilFruit(Long id) {
        if (devilFruitRepository.existsById(id)) {
            devilFruitRepository.deleteById(id);
        }
    }

}
