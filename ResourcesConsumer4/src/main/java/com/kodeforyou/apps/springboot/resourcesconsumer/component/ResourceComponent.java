package com.kodeforyou.apps.springboot.resourcesconsumer.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kodeforyou.apps.springboot.resourcesconsumer.ResourceDto;
import com.kodeforyou.apps.springboot.resourcesconsumer.proxy.ResourceSrvcProxy;

@Component
public class ResourceComponent {
	@Autowired
	private ResourceSrvcProxy resourceSrvcProxy;
	
	public ResourceDto get(int rid) {
		System.out.println(resourceSrvcProxy.getClass());
		return resourceSrvcProxy.getResoruce(rid);
	}
	public List<ResourceDto> list(){
		return resourceSrvcProxy.getAllResoruces();
	}
}
