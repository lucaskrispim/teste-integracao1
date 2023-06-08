package app.repository;

import app.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getProductCount() {
        return products.size();
    }

    // Outros métodos do repositório de produtos
}