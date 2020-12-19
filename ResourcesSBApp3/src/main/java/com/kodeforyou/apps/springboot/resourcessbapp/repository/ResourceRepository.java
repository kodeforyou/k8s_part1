package com.kodeforyou.apps.springboot.resourcessbapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodeforyou.apps.springboot.resourcessbapp.entity.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {
   
}
