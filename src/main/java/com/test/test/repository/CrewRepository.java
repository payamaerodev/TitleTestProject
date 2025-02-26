package com.test.test.repository;

import com.test.test.model.Crew;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface CrewRepository extends CrudRepository<Crew, String> {

    public Crew save(Entity entity);

}
