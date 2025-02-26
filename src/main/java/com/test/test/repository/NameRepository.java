package com.test.test.repository;

import com.test.test.model.Name;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface NameRepository extends CrudRepository<Name, String> {

    public Name save(Entity entity);

  @Query("from name n where n.deathYear=0")
  List<Name> findLiveWriters();
}
