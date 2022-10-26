package management_growth.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import management_growth.dto.ProductDto;
import management_growth.repository.ProductRepository;
import management_growth.response.Product;
import management_growth.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepository;
	public ProductDto save_method(ProductDto productDto) {
		Product product = new Product().builder()
				.id(productDto.getId())
				.name(productDto.getName()).phone(productDto.getPhone()).build();
		
		Product saveProduct = productrepository.save(product);
		System.out.println(saveProduct);
		return productDto;
	}

	@Override
	public ProductDto getById(ProductDto productDto) {
		Product product =productrepository.getById(productDto.getId());
		
		return productDto;
	}
//	@Override
//	public ProductDto getById(ProductDto productresponce) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
