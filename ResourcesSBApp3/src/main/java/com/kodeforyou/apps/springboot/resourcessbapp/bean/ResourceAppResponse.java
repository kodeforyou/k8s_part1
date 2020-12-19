package com.kodeforyou.apps.springboot.resourcessbapp.bean;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourceAppResponse<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private T data;
	private String message;
	private boolean success;
	private HttpStatus statusCode;
}
