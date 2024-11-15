package com.example.demo;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.Runwith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class Integerationtesting
{
@LocalServerPort
private int port;
private URL   url;
@Autowired
private TestRestTemplate restTemplate;
@Before
public void setUp() throws MalformedURLException
{
    this.url=new URL("http://localhost:"+port+"/");
}
@Test
public void testGetGreet()
{
    ResponseEntity<String> responseEntity=restTemplate.getForEntity(url.toString(),String.class);
    assertThat(responseEntity.getBody(),equalTo("Welcome-to-Spring-boot"));




            ;

            ;
}

    private void assertThat(String body, Matcher<String> equalTo) {
    }


}
