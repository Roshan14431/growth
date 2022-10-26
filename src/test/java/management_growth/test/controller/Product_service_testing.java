package management_growth.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import management_growth.dto.ProductDto;
import management_growth.repository.ProductRepository;
import management_growth.response.Product;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Product_service_testing {
	@Autowired
	private WebApplicationContext context;

	private MockMvc mockmvc;
	private ObjectMapper mapper = new ObjectMapper();
	@MockBean
	private ProductRepository patientRepoMock;

	@BeforeEach
	public void setup() {
		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	void product_testing_serviceMethod() {
		Product productDto = new Product().builder().id(25).name("dfghj").phone(74128l).build();
		ProductDto add = new ProductDto();
		when(patientRepoMock.save(Mockito.any())).thenReturn(productDto);
		Product dataProduct = patientRepoMock.save(productDto);
		assertEquals(dataProduct, productDto);
	}

}
