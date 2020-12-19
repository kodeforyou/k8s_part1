package com.kodeforyou.apps.springboot.resourcessbapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodeforyou.apps.springboot.resourcessbapp.bean.ResourceDto;
import com.kodeforyou.apps.springboot.resourcessbapp.service.ResourceService;

@RestController
@RequestMapping("/api/v1/resources")
public class ResourceRESTController {
	@Autowired
	private ResourceService resourceService;

	@PostMapping(consumes = "application/json")
	public ResponseEntity<String> store(@RequestBody ResourceDto resourceDto) {
		if (resourceService.store(resourceDto)) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	@GetMapping(path = "/{rid}", produces = "application/json")
	public ResourceDto get(@PathVariable("rid") int rid) {
		ResourceDto resource = null;
		resource = resourceService.get(rid);
		
		return resource;
	}

	@GetMapping(produces = "application/json")
	public List<ResourceDto> list() {
		return resourceService.list();
	}

	@DeleteMapping(path = "/{rid}")
	public ResponseEntity<String> delete(@PathVariable("rid") int rid) {
		resourceService.delete(rid);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	@PutMapping(path = "/{rid}", consumes = "application/json")
	public ResponseEntity<String> update(@PathVariable("rid") int rid, @RequestBody ResourceDto resource) {
		resource.setId(rid);
		resourceService.update(resource);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
