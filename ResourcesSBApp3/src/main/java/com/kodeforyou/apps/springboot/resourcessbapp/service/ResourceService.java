package com.kodeforyou.apps.springboot.resourcessbapp.service;

import java.util.List;

import com.kodeforyou.apps.springboot.resourcessbapp.bean.ResourceDto;

public interface ResourceService {
	List<ResourceDto> list();
	
	boolean store(ResourceDto resourceDto);
	
	ResourceDto delete(int rid);
	
	ResourceDto update(ResourceDto resourceDto);
	
	ResourceDto get(int rid);
}
