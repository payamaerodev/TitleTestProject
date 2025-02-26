package com.test.test.repository;

import com.test.test.model.Principal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.List;

@Repository
public interface PrincipalRepository extends CrudRepository<Principal, String> {

    public Principal save(Entity entity);

    @Query("from principal p where( p.nconst=:act1 and p.nconst=:act2) and p.category='actor'")
    public List<Principal> getTitlesByActs(String act1, String act2);

}
