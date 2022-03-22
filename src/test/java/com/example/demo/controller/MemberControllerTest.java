package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = MemberController.class)
public class MemberControllerTest {

	@Autowired
	private MockMvc mvc;
	
    @Test
    public void test_return_test() throws Exception {
        String hello = "hello";
        Long longVal = 1L;
        
        mvc.perform(get("/test"))
                .andExpect(status().isOk())
        		.andExpect(content().string(longVal.toString()));
    }
}
