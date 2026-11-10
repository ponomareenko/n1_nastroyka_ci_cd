package ru.netology.n1_nastroyka_ci_cd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() throws Exception {
        mockMvc.perform(get("/api/calculator/add?a=1&b=2"))
                .andExpect(status().isOk())
                .andExpect(content().string("3.0"));
    }

    @Test
    public void testSubtract() throws Exception {
        mockMvc.perform(get("/api/calculator/subtract?a=7&b=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("4.0"));
    }
}