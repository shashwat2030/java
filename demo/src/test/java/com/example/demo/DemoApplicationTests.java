package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.TestExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootTest
@EnableWebMvc
@AutoConfigureMockMvc
class DemoApplicationTests {
@Autowired
private MockMvc mockmvc;




	@Test
	public void testHelmsg() throws Exception
	{

	mockmvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON)).andExpect(status().isok()).andExpect(content().string(equalTo("Hello is this is from STS")));
	}

}
