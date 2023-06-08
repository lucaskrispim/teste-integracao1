package app.service;

import app.repository.ProductRepository;

public class OrderService {
    private ProductRepository productRepository;

    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public int getAvailableProductCount() {
        return productRepository.getProductCount();
    }

    // Outros métodos do serviço de pedidos
}
