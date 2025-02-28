package com.test.test.controller;

import com.test.test.model.Crew;
import com.test.test.model.Name;
import com.test.test.model.Principal;
import com.test.test.model.Rate;
import com.test.test.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/")
public class TitleController {
    @Autowired
    TitleService service;

    @GetMapping(value = "/live-directors")
    public List<Crew> getLiveDirectors() {
        return service.getLive();
    }
    @GetMapping(value = "/test/{act1}/{act2}")
    public List<Principal> getTitleForCharacters(@PathVariable(name = "act1") String act1, @PathVariable(name = "act2") String act2) {
        return service.getTileForActs(act1,act2);
    }

    @GetMapping(value = "/genre/best")
    public Rate getBestMovieBYRate() {
        return service.getBestMovieBYRate();
    }

    @GetMapping(value = "/count")
    public Integer getCount(HttpServletRequest request) {
     return   (Integer) request.getAttribute("count");
    }
}
