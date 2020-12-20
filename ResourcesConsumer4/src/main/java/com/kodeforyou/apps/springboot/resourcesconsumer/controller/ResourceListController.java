package com.kodeforyou.apps.springboot.resourcesconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodeforyou.apps.springboot.resourcesconsumer.component.ResourceComponent;

@RestController
@RequestMapping("/api/v1/resource/")
public class ResourceListController {
	@Autowired
	private ResourceComponent rc;
	@GetMapping
	public String list() {
		return  rc.list().toString();
	}
}
