package com.smartfoxpro.restapp.controller;

import com.smartfoxpro.restapp.model.Showroom;
import com.smartfoxpro.restapp.service.ShowroomService;
import com.smartfoxpro.restapp.validator.ShowroomValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ShowroomController {

    private final ShowroomService showroomService;

    private final ShowroomValidator showroomValidator;

    @Autowired
    public ShowroomController(ShowroomService showroomService, ShowroomValidator showroomValidator){
        this.showroomService = showroomService;
        this.showroomValidator = showroomValidator;
    }

    @GetMapping(value = "/")
    public ModelAndView mainPage(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value = "/showroom", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Showroom> findAll() {
        return showroomService.findAll();
    }

    @GetMapping(value = "/showroom/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Showroom find(@PathVariable("id") int id) {
        return showroomService.find(id);
    }

//    @PostMapping(value = "")

//    PostMapping(value = )



}
//GET /someCollection
//        GET /someCollection/{id}
//        POST /someCollection
//        PUT /someCollection/{id}
//        PATCH /someCollection/{id}
//        HEAD /someCollection/{id}
//        DELETE /someCollection/{id}