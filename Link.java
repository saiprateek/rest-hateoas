package com.hetos.media;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Link extends ResourceSupport {

	private final String rel;
	private final String href;
	
	@JsonCreator
	public Link(@JsonProperty("rel")String rel, @JsonProperty("href")String href) {
		this.href = href;
		this.rel=rel;
	}

	public String getRel() {
		return rel;
	}

	public String getHref() {
		return href;
	}
	
	
}
