package com.example.TddTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WineControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * 와인 생성 테스트
     * @throws Exception
     */
    @Test
    void shouldCreateWine() throws Exception {
        String wineJson = """
                {
                    "name" : "Minsu",
                    "country" : "korea",
                    "variety" : "white",
                    "price" : 20.0
                }
                """;

        mockMvc.perform(post("/wines")
                .contentType(MediaType.APPLICATION_JSON)
                .content(wineJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNotEmpty())
                .andExpect(jsonPath("$.name").value("Minsu"))
                .andExpect(jsonPath("$.country").value("korea"))
                .andExpect(jsonPath("$.variety").value("white"))
                .andExpect(jsonPath("$.price").value(20.0));

    }


}
