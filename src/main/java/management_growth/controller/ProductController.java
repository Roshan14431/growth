package management_growth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import management_growth.dto.ProductDto;
import management_growth.serviceImpl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductServiceImpl productService;

	@PostMapping("/add")
	public ResponseEntity<ProductDto> saveProductDeails(@RequestBody ProductDto data) {
		ProductDto ProductDto2 = productService.save_method(data);
		return new ResponseEntity<>(ProductDto2, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> getById_product(ProductDto product) {
		ProductDto productDto = productService.getById(product);
		return new ResponseEntity<>(productDto, HttpStatus.OK);

	}

}
