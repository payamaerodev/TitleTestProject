package com.test.test.repository;

import com.test.test.model.Akas;
import com.test.test.model.Rate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface RateRepository extends CrudRepository<Rate, String> {

    public Rate save(Entity entity);
    @Query("select r from rate r order by r.averageRating,r.numVotes ")
    public List<Rate> bestRate();

}
