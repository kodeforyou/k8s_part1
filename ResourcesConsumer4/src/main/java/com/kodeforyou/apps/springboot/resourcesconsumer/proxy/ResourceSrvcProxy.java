package com.kodeforyou.apps.springboot.resourcesconsumer.proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kodeforyou.apps.springboot.resourcesconsumer.ResourceDto;

//@FeignClient(name="resource-srvc-proxy")
@FeignClient(name="resource-sb-app3-srvc",url = "http://resource-sb-app3-srvc:8080")
//@RibbonClient
public interface ResourceSrvcProxy {
	@RequestMapping(value="api/v1/resources", method=RequestMethod.GET)
    public abstract List<ResourceDto> getAllResoruces();
	
	@RequestMapping(value="api/v1/resources/{rid}", method=RequestMethod.GET)
    public abstract ResourceDto getResoruce(@PathVariable(value = "rid") int rid);
}
