package management_growth.test.controller;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import management_growth.repository.ProductRepository;
import management_growth.response.Product;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class ProductRepositoryTesting {

	@MockBean
	ProductRepository productRepoMock;
	
	@Test
	void TestingRepoSaveMethod() throws Exception {
		Product product = new Product().builder().id(2)
				.name("roshan")
				.phone(785265l)
				.build();
		when(productRepoMock.save(product)).thenReturn(product);
		Product savedProduct = productRepoMock.save(product);

		System.out.println(savedProduct);
		assertEquals(savedProduct.getId(),product.getId());
	}


}
