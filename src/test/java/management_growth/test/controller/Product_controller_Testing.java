package management_growth.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import management_growth.dto.ProductDto;
import management_growth.serviceImpl.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Product_controller_Testing {
	@Autowired
	private WebApplicationContext context;

	private MockMvc mockmvc;
	
	private ObjectMapper mapper = new ObjectMapper();
	@MockBean
	private ProductServiceImpl patientServiceMock;

	@BeforeEach
	public void setup() {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void product_testing_savemethod() throws Exception {
		
		ProductDto productDto = new ProductDto().builder().id(16).name("roshan").phone(64521l).build();
		when(patientServiceMock.save_method(Mockito.any())).thenReturn(productDto);
		 String writeValueAsString = mapper.writeValueAsString(productDto);
		 mockmvc
				.perform(post("/product/add").accept(MediaType.ALL).contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(writeValueAsString))
				.andExpect(status().isOk())
				.andDo(print())
				.andExpect(jsonPath("$.id").value(productDto.getId()));
//				.andReturn().getResponse().getContentAsString();
//		ProductDto readValue = mapper.readValue(contentAsString, ProductDto.class);
//		assertEquals(contentAsString, writeValueAsString);
	}
}
