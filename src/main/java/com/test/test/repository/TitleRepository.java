package com.test.test.repository;

import com.test.test.model.TitleBasic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface TitleRepository extends CrudRepository<TitleBasic, String> {

    public TitleBasic save(Entity entity);

}
