package co.com.store.serviceproducr.service;

import co.com.store.serviceproducr.entities.Category;
import co.com.store.serviceproducr.entities.Product;
import java.util.List;

public interface ProductService {

  List<Product> listAllProduct();
  Product getProduct(Long id);

  Product createProduct(Product product);
  Product updateProduct(Product product);
  Product deleteProduct(Long id);
  List<Product> findByCategory(Category category);
  Product updateStock(Long id, Double quantity);
}
