package com.hetos.media;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HetosController {

	@RequestMapping(path="/restmedia/employee", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee() {
		Employee employee = new Employee();
		List<Link> links = new ArrayList<Link>();
		
		Link linkedin = new Link("linkedin", "www.linkedin.com");
		Link self = new Link("self", "www.facebook.com");
		links.add(self);
		links.add(linkedin);
		
		employee.setId("123");
		employee.setName("Media man");
		employee.setLinks(links);
		
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
}
