package com.kodeforyou.apps.springboot.resourcessbapp.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodeforyou.apps.springboot.resourcessbapp.bean.ResourceDto;
import com.kodeforyou.apps.springboot.resourcessbapp.entity.Resource;
import com.kodeforyou.apps.springboot.resourcessbapp.repository.ResourceRepository;
import com.kodeforyou.apps.springboot.resourcessbapp.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{

	@Autowired
	private ResourceRepository resoureRepository;
	@Override
	public List<ResourceDto> list() {
		return  resoureRepository.findAll().stream().map(ResourceDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public boolean store(ResourceDto resourceDto) {
		resoureRepository.save(ResourceDto.toEntity(resourceDto));
		return true;
	}

	@Override
	public ResourceDto delete(int rid) {
		ResourceDto resourceDto = get(rid);
		resoureRepository.deleteById(rid);
		return resourceDto;
	}

	@Override
	public ResourceDto update(ResourceDto resourceDto) {
		return ResourceDto.fromEntity(resoureRepository.save(ResourceDto.toEntity(resourceDto)));
	}

	@Override
	public ResourceDto get(int rid) {
		Optional<Resource> optionalResource = resoureRepository.findById(rid);
		if(optionalResource.isPresent())
		   return ResourceDto.fromEntity(optionalResource.get());
		return null;
	}

}
