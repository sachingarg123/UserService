package com.test.altimetrik.userservice.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.altimetrik.userservice.bean.Welcome;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
	
	@Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void noAuth() {
        
        String testName = "test";
        String request = "/users?name=" + testName;
        ResponseEntity<Welcome> response = restTemplate.getForEntity(request, Welcome.class);
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
    }

}
