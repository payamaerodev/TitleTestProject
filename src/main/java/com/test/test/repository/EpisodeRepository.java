package com.test.test.repository;

import com.test.test.model.Akas;
import com.test.test.model.Episode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface EpisodeRepository extends CrudRepository<Episode, String> {

    public Episode save(Entity entity);

}
