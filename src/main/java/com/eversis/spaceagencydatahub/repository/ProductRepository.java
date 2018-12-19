package com.eversis.spaceagencydatahub.repository;

import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @Override
    List<Product> findAll();

    Optional<Product> findById(Long id);

    @Override
    Product save(Product product);

    void deleteById(Long id);

    @Override
    long count();
}
