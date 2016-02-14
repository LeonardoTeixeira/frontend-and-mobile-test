package br.com.cinq.sample;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cinq.sample.resource.PeopleResource;

/**
 * Register Jersey modules
 */
@Configuration
@ApplicationPath("rest")
public class Config extends ResourceConfig {

	public Config() {
		register(PeopleResource.class);
	}
	

	/**
	 * Either you use the bean initialization to redirect rest calls or use @ApplicationPath
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, Config.class.getName());
        return registration;
    }
	 */

}