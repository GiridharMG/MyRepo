package com.googlemaps.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.media.multipart.MultiPartFeature;

import com.googlemaps.rest.services.FileUploadService;

@ApplicationPath("/api")
public class GoogleRestApplication extends Application {
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		resources.add(MultiPartFeature.class);
		resources.add(FileUploadService.class);
		
		return resources;
	}
}
