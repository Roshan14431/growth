package management_growth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import management_growth.dto.ProductDto;
import management_growth.response.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	

}
