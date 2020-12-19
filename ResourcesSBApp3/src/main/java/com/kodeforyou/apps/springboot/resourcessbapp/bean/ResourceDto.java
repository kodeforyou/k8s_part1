package com.kodeforyou.apps.springboot.resourcessbapp.bean;

import org.springframework.beans.BeanUtils;

import com.kodeforyou.apps.springboot.resourcessbapp.entity.Resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceDto {
	  private int id;
	    private String lastname;
	    private String firstname;
	    private String role;
	    private String skillset;
	    private int salary;
	    public static ResourceDto fromEntity(Resource resource){
	       ResourceDto dto = new ResourceDto();
	       BeanUtils.copyProperties(resource, dto);
	       return dto;
	    }
	    public static Resource  toEntity(ResourceDto dto) {
	    	Resource resource = new Resource();
	    	BeanUtils.copyProperties(dto, resource);
	    	return resource;
	    }
}
