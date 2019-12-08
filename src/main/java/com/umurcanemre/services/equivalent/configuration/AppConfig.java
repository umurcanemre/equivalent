package com.umurcanemre.services.equivalent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.Data;

@Configuration
@Data
public class AppConfig {
	@Bean
	public OpenAPI customOpenAPI() {
		Contact contact = new Contact();
		contact.setEmail("ibrahimumurcanemre@hotmail.com");
		contact.setUrl("http://www.umurcanemre.com");
		contact.setName("Umurcan Emre");
		
		return new OpenAPI()
	    		.components(new Components())
	            .info(new Info().title("Equivalent API's")
	            		.description("Metadata service for GUI's and other services")
	            		.contact(contact));
	}
}
