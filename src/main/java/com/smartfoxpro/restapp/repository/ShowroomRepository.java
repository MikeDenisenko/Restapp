package com.smartfoxpro.restapp.repository;

import com.smartfoxpro.restapp.model.Showroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ShowroomRepository extends JpaRepository<Showroom, Integer> {

    @Query("select s from Showroom s where s.id = :id")
    Showroom find(@Param("id") int id);

}
