package com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.repository;

import com.devilfruitencyclopedia.thedevilfruitencyclopediaapi.entity.DevilFruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitRepository extends CrudRepository<DevilFruit,Long> {
    /* si on a besoin de méthodes extra customisées on va les ajouter ici
       mais live on a extend de CrudRepository donc on a déjà
       findById, findAll, save, deleteById, deleteAll, et etc. (bhays basiques CRUD)
     */
}
