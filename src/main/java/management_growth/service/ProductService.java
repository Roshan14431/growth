package management_growth.service;

import management_growth.dto.ProductDto;
import management_growth.response.Product;

public interface ProductService {

	public ProductDto  save_method(ProductDto productresponce);
	public ProductDto getById(ProductDto id);

	//void save_method(ProductResponce productResponce);
}
