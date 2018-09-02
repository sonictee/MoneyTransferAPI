package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	/** timeout In Milliseconds **/
	@Value("${http.connection.timeoutInMS}")
	private Integer timeoutInMS;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		RestTemplate restTemplate = builder.build();
		restTemplate.setRequestFactory(this.clientHttpRequestFactory());
		return restTemplate;
	}
	
	private ClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		httpRequestFactory.setReadTimeout(timeoutInMS);
		httpRequestFactory.setConnectTimeout(timeoutInMS);
	
		return new BufferingClientHttpRequestFactory(httpRequestFactory);
	}
}
