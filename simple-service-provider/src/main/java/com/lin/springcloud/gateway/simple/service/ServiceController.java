package com.lin.springcloud.gateway.simple.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ServiceController {
	
	@Value("${server.port}")
	private String host;
	
	@RequestMapping(value = "/", produces = "text/plain;charset=UTF-8")
	public Mono<String> root() {
		return Mono.just(host+"/");
	}

	@RequestMapping(value = "/v1", produces = "text/plain;charset=UTF-8")
	public Mono<String> v1() {
		return Mono.just("v1");
	}

	@RequestMapping(value = "/v2", produces = "text/plain;charset=UTF-8")
	public Mono<String> v2() {
		return Mono.just("v2");
	}
}
