package management_growth.response;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import management_growth.dto.ProductDto;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name= "product_dto")
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Long phone;
	
}
