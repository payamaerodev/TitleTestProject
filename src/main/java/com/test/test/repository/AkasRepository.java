package com.test.test.repository;

import com.test.test.model.Akas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface AkasRepository extends CrudRepository<Akas, String> {

    public Akas save(Entity entity);

}
