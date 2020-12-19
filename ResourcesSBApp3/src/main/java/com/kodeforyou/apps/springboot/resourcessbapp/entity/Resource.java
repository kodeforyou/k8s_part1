package com.kodeforyou.apps.springboot.resourcessbapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "resources")
@Getter
@Setter
public class Resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
    private String lastname;
    private String firstname;
    private String role;
    private String skillset;
    private int salary;
}
