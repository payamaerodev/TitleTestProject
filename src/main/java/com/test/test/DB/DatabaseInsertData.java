package com.test.test.DB;

import com.test.test.model.*;
import com.test.test.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
@Component
public class DatabaseInsertData {

    @Autowired
    public TitleRepository titleRepo;
    @Autowired
    public CrewRepository crewRepo;
    @Autowired
    public EpisodeRepository episodeRepo;
    @Autowired
    public NameRepository nameBRepo;
    @Autowired
    public PrincipalRepository principalRepo;
    @Autowired
    public AkasRepository akasRepo;
    @Autowired
    private RateRepository rateRepository;


    public void insertBasic(List<String> list) {
        TitleBasic title = new TitleBasic();
        title.setId(list.get(0));
        title.setType(list.get(1));
        title.setPrimaryTitle(list.get(2));
        title.setOriginalTitle(list.get(3));
        title.setIsAdult(list.get(4));
        title.setStartYear(list.get(5));
        title.setEndYear(list.get(6));
        title.setRuntimeMinutes(list.get(7));
        title.setGenres(list.get(8));
        titleRepo.save(title);
    }

    public void insertCrew(List<String> list) {

        Crew c = new Crew();
        c.setId(list.get(0));
        c.setDirectors(list.get(1));
        c.setWriters(list.get(2).equals("\\N")?null:list.get(2));
        crewRepo.save(c);
    }

    public void insertAkas(List<String> list) {

        Akas c = new Akas();
        c.setId(list.get(0));
        c.setOrdering(Integer.valueOf(list.get(1)));
        c.setTitle(list.get(2));
        c.setRegion(list.get(3));
        c.setLanguage(list.get(4));
        c.setTypes(list.get(5));
        c.setAttributes(list.get(6));
        c.setIsOriginalTitle(Integer.valueOf(list.get(7)));
        akasRepo.save(c);
    }

    public void insertPrincipal(List<String> list) {

        Principal c = new Principal();
        c.setId(list.get(0));
        c.setOrdering(Integer.valueOf(list.get(1)));
        c.setNconst(list.get(2));
        c.setCategory(list.get(3));
        c.setJob(list.get(4));
        c.setCharacters(list.get(5));
        principalRepo.save(c);
    }

    public void insertEpisode(List<String> list) {

        Episode c = new Episode();
        c.setId(list.get(0));
        c.setParentConst(list.get(1));
        Integer n1;
        try {
            n1 = Integer.valueOf(list.get(2));
        } catch (NumberFormatException e) {

            n1 = 0;
        }
        c.setSeasonNumber(n1);
        try {
            n1 = Integer.valueOf(list.get(3));
        } catch (NumberFormatException e) {

            n1 = 0;
        }
        c.setEpisodeNumber(n1);
        episodeRepo.save(c);
    }

    public void insertRate(List<String> list) {

        Rate c = new Rate();
        c.setID(list.get(0));
        double d;
        try {
            d = Double.parseDouble(list.get(1));
        } catch (EnumConstantNotPresentException e) {
            d = 0.0;
        }
        c.setAverageRating(d);
        c.setNumVotes(Integer.valueOf(list.get(2)));
        rateRepository.save(c);
    }

    public void insertName(List<String> list) {

        Name c = new Name();
        c.setId(list.get(0));
        c.setPrimaryName(list.get(1));
        int in = list.get(2).equals("\\N")?0:Integer.valueOf(list.get(2));
        c.setBirthYear(in);
         in = list.get(3).equals("\\N")?0:Integer.valueOf(list.get(3));

        c.setDeathYear(in);
        c.setPrimaryProfession(list.get(4));
        c.setKnownForTitles(list.get(5));
        nameBRepo.save(c);
    }
}
