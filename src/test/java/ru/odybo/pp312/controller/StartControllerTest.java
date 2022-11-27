package ru.odybo.pp312.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(StartController.class) // <1>
public class StartControllerTest {

  @Autowired
  private MockMvc mockMvc; // <2>

  @Test
  public void testStartPage() throws Exception {
    mockMvc.perform(get("/")) // <3>
        .andExpect(status().isOk()) // <4>
        .andExpect(view().name("start")) // <5>
        .andExpect(content().string( // <6>
            containsString("CRUD")));
  }

}
