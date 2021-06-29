package com.smartfoxpro.restapp.service;

import com.smartfoxpro.restapp.model.Showroom;
import com.smartfoxpro.restapp.repository.ShowroomRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShowroomService {

    private static final Logger LOG = LogManager.getLogger(ShowroomService.class);

    private ShowroomRepository showroomRepository;

    @Autowired
    public ShowroomService(ShowroomRepository showroomRepository) {
        this.showroomRepository = showroomRepository;
    }

    public Showroom save(Showroom showroom) {
        LOG.info("Saving...");
        return showroomRepository.saveAndFlush(showroom);
    }

    public List<Showroom> findAll() {
        LOG.info("Finding...");
        return showroomRepository.findAll();
    }

    public Showroom find(int id) {
        LOG.info("Finding...");
        return showroomRepository.find(id);
    }

    public void delete(int id){
        LOG.info("Deleting...");
        showroomRepository.deleteById(id);
    }

    public Showroom Update(Showroom showroom) {
        LOG.info("Updating...");
        return showroomRepository.saveAndFlush(showroom);
    }


}
