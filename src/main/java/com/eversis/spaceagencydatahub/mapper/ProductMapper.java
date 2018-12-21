package com.eversis.spaceagencydatahub.mapper;

import com.eversis.spaceagencydatahub.domain.Mission;
import com.eversis.spaceagencydatahub.domain.Product;
import com.eversis.spaceagencydatahub.domain.ProductDto;
import com.eversis.spaceagencydatahub.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    @Autowired
    private DbService dbService;

    public Product mapToProduct(ProductDto productDto) {
        Mission mission = dbService.getMission(productDto.getMissionId()).orElse(null);
        return new Product(mission, productDto.getAcquisitionDate(), productDto.getFirstCoordinate(), productDto.getSecondCoordinate(), productDto.getThirdCoordinate(), productDto.getFourthCoordinate(), productDto.getProductPrice(), productDto.getProductURL());
    }

    public ProductDto mapToProductDto(Product product) {

        return new ProductDto(product.getId(), product.getMission().getId(), product.getAcquisitionDate(), product.getFirstCoordinate(), product.getSecondCoordinate(), product.getThirdCoordinate(), product.getFourthCoordinate(), product.getProductPrice(), product.getProductURL());
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        return productList.stream()
                .map(p -> new ProductDto(p.getId(), p.getMission().getId(), p.getAcquisitionDate(), p.getFirstCoordinate(), p.getSecondCoordinate(), p.getThirdCoordinate(), p.getFourthCoordinate(), p.getProductPrice(), p.getProductURL()))
                .collect(Collectors.toList());
    }
}
