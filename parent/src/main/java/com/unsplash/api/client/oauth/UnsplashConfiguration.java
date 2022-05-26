package com.unsplash.api.client.oauth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProvider;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientProviderBuilder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizedClientManager;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.web.client.RestTemplate;

@SuppressWarnings("deprecation")
@Configuration
public class UnsplashConfiguration extends WebSecurityConfigurerAdapter {
	  
	/*
	 * haciendo que todos los puntos finales sean accesibles
	 * */
	protected void configure(HttpSecurity http) throws Exception {
	    http.oauth2Client();   
	    http.authorizeRequests()
	      .anyRequest().permitAll();    
	  }

	/*
	 * Necesitamos un RestTemplate para llamar al punto final expuesto por el servidor de recursos*/
	@Bean    
	  public RestTemplate restTemplate() {    
	    return new RestTemplate();
	  }
	
	/*
	 * El cliente primero necesita obtener un token de acceso del servidor de autorización antes de llamar 
	 * a los puntos finales del servidor de recursos. Por supuesto, queremos que esta llamada para obtener el token 
	 * de acceso sea realizada automáticamente por nuestro cliente*/
	@Bean
	  public OAuth2AuthorizedClientManager authorizedClientManager(
	          ClientRegistrationRepository clientRegistrationRepository,
	          OAuth2AuthorizedClientRepository authorizedClientRepository) {
	 
	    OAuth2AuthorizedClientProvider authorizedClientProvider =
	            OAuth2AuthorizedClientProviderBuilder.builder()
	                    .clientCredentials()
	                    .build();
	 
	    var authorizedClientManager = new DefaultOAuth2AuthorizedClientManager(
	                                          clientRegistrationRepository,
	                                          authorizedClientRepository);
	 
	    authorizedClientManager
	      .setAuthorizedClientProvider(authorizedClientProvider);
	 
	    return authorizedClientManager;
	  }
}
