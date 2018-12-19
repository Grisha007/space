package com.eversis.spaceagencydatahub.mapper;

import com.eversis.spaceagencydatahub.domain.Product;
import com.eversis.spaceagencydatahub.domain.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    public Product mapToProduct(ProductDto productDto) {
        return new Product(productDto.getMission(), productDto.getAcquisitionDate(), productDto.getCoordinates(), productDto.getProductPrice(), productDto.getProductURL());
    }

    public ProductDto mapToProductDto(Product product) {
        return new ProductDto(product.getMission(), product.getAcquisitionDate(), product.getCoordinates(), product.getProductPrice(), product.getProductURL());
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        return productList.stream()
                .map(p -> new ProductDto(p.getMission(), p.getAcquisitionDate(), p.getCoordinates(), p.getProductPrice(), p.getProductURL()))
                .collect(Collectors.toList());
    }
}
