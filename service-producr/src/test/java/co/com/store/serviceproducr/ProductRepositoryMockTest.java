package co.com.store.serviceproducr;

import co.com.store.serviceproducr.entities.Category;
import co.com.store.serviceproducr.entities.Product;
import co.com.store.serviceproducr.repository.ProductRepository;
import java.util.Date;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ProductRepositoryMockTest {

  @Autowired
  private ProductRepository productRepository;

  @Test
  public void whenFindByCategory_ThenReturnListProduct(){

    Product product01 = Product.builder()
        .name("Computer")
        .category(Category.builder()
            .id(1L)
            .build())
        .description("")
        .stock(Double.parseDouble("10"))
        .price(Double.parseDouble("1240.99"))
        .createAt(new Date())
        .build();

    productRepository.save(product01);
    List<Product> productList = productRepository.findByCategory(product01.getCategory());

    Assertions.assertThat(productList.size()).isEqualTo(3);
  }
}
