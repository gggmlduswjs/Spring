package com.acon.prac4.데이터응답;

import static org.junit.Assert.*;

import org.junit.Test;

package com.acorn.day4.요청응답;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(서버가데이터응답하기.class)
public class 서버가데이터응답하기Test {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testData1() throws Exception {
        mockMvc.perform(get("/data1"))
               .andExpect(status().isOk())
               .andExpect(content().string("data1 서버가 보낸 데이터 message"));
    }

    @Test
    public void testData2() throws Exception {
        mockMvc.perform(get("/data2"))
               .andExpect(status().isOk())
               .andExpect(content().string(" ResponseEntity 서버가 보내는 message !!!!"));
    }

    @Test
    public void testData3() throws Exception {
        mockMvc.perform(get("/data3"))
               .andExpect(status().isOk())
               .andExpect(content().string("서버가 보내는 message ^^^^^^"));
    }

    @Test
    public void testData4() throws Exception {
        mockMvc.perform(get("/data4"))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON))
               .andExpect(jsonPath("$.id").value("gildong"))
               .andExpect(jsonPath("$.pw").value("1234"));
    }

    @Test
    public void testData5() throws Exception {
        mockMvc.perform(get("/data5"))
               .andExpect(status().isOk())
               .andExpect(content().contentType(MediaType.APPLICATION_JSON))
               .andExpect(content().json("{\"id\":\"wjy\",\"pw\":\"0000\"}"));
    }
}
