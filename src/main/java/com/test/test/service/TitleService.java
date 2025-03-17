package com.test.test.service;

import com.test.test.DB.DBHandler;
import com.test.test.model.Crew;
import com.test.test.model.Name;
import com.test.test.model.Principal;
import com.test.test.model.Rate;
import com.test.test.repository.NameRepository;
import com.test.test.repository.PrincipalRepository;
import com.test.test.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TitleService {
    @Autowired
    DBHandler init;
    @PersistenceContext
    EntityManager em;
    @Autowired
    NameRepository repo;
    @Autowired
    PrincipalRepository principalRepo;
    @Autowired
    RateRepository rateRepo;

    public TitleService(DBHandler init) {
        this.init = init;
        init.init();
    }

    public List<Crew> getLive() {
        List<Name> lives = repo.findLiveWriters();
        Set<Crew> sets = new HashSet<>();
        lives.forEach(l -> sets.addAll(l.directors));
        return sets.stream().filter(s -> s.getDirectors().equals(s.getWriters())).collect(Collectors.toList());
    }

    public List<Principal> getTileForActs(String act1, String act2) {
        List<Principal> originalTitles = principalRepo.getTitlesByActs(act1, act2);
        List<String> moviesForAct1 = originalTitles.stream().map(Principal::getId).filter(id -> id.equals(act1)).toList();
        List<String> moviesForAct2 = originalTitles.stream().map(Principal::getId).filter(id -> id.equals(act2)).toList();
        List<String> moviesForAct3 = originalTitles.stream().map(Principal::getId).filter(id -> id.equals(act2)).collect(Collectors.toList());
        moviesForAct3.contains("abs");
        return originalTitles.stream().filter(l -> moviesForAct1.contains(l.getId()) && moviesForAct2.contains(l.getId())).toList();
    }

    public Rate getBestMovieBYRate() {
        return rateRepo.bestRate().stream().findFirst().orElse(null);
    }
}
