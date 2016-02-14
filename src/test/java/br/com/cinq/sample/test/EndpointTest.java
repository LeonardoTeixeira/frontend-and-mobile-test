package br.com.cinq.sample.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import br.com.cinq.sample.Application;
import br.com.cinq.sample.bean.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
@IntegrationTest("server.port=9000")
@ActiveProfiles("unit")
public class EndpointTest {
	Logger logger = LoggerFactory.getLogger(EndpointTest.class);

	private final String localhost = "http://localhost:";
	
	@Value("${local.server.port}")
	private int port;

	private RestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void testGet() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<Person[]> response = this.restTemplate.exchange(
				this.localhost + this.port + "/rest/people", HttpMethod.GET, entity, Person[].class);

		Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
		Person[] list = response.getBody();
		Assert.assertNotNull(list);
	}
}
