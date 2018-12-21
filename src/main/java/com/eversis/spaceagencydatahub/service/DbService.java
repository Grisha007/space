package com.eversis.spaceagencydatahub.service;

import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.Product;
import com.eversis.spaceagencydatahub.repository.MissionRepository;
import com.eversis.spaceagencydatahub.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class DbService {
    @Autowired
    private MissionRepository missionRepository;

    @Autowired
    private ProductRepository productRepository;

    public Mission saveMission(final Mission mission) {
        return missionRepository.save(mission);
    }

    public void deleteMission(final Long id) {
        missionRepository.deleteById(id);
    }

    public Product saveProduct(final Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProduct(final Long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(final Long id) {
        productRepository.deleteById(id);
    }
}
