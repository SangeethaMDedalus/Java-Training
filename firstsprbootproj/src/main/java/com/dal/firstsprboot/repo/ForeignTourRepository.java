package com.dal.firstsprboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dal.firstsprboot.entity.ForeignTour;

public interface ForeignTourRepository extends JpaRepository<ForeignTour, Long>{

}
