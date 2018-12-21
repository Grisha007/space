package com.eversis.spaceagencydatahub.mapper;

import com.eversis.spaceagencydatahub.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTestSuite {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void testMapToProduct() {
        //Given
        Mission mission = new Mission("Mission one", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.PANCHROMATIC);
        ProductDto productDto = new ProductDto(mission, LocalDate.of(2018, 12, 7), new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5), new BigDecimal(35000.25), "http//:testurlone.com");

        //When
        Product mappedProduct = productMapper.mapToProduct(productDto);

        //Then
        assertEquals("Mission one", mappedProduct.getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedProduct.getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedProduct.getMission().getMissionFinishDate());
        assertEquals(ImageryType.PANCHROMATIC, mappedProduct.getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedProduct.getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedProduct.getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedProduct.getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedProduct.getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedProduct.getFourthCoordinate());
        assertEquals("http//:testurlone.com", mappedProduct.getProductURL());
    }

    @Test
    public void testMapToProductDto() {
        //Given
        Mission mission = new Mission("Mission two", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.MULTISPECTRAL);
        Product product = new Product(mission, LocalDate.of(2018, 12, 7), new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5), new BigDecimal(35000.25), "http//:testurltwo.com");

        //When
        ProductDto mappedProductDto = productMapper.mapToProductDto(product);

        //Then
        assertEquals("Mission two", mappedProductDto.getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedProductDto.getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedProductDto.getMission().getMissionFinishDate());
        assertEquals(ImageryType.MULTISPECTRAL, mappedProductDto.getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedProductDto.getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedProductDto.getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedProductDto.getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedProductDto.getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedProductDto.getFourthCoordinate());
        assertEquals("http//:testurltwo.com", mappedProductDto.getProductURL());
    }

    @Test
    public void testMapToProductDtoList() {
        //Given
        Mission mission = new Mission("Mission three", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.HYPERSPECTRAL);
        Product product = new Product(mission, LocalDate.of(2018, 12, 7), new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5), new BigDecimal(35000.25), "http//:testurlthree.com");
        List<Product> productList = new ArrayList<>();
        productList.add(product);

        //When
        List<ProductDto> mappedListProductDto = productMapper.mapToProductDtoList(productList);

        //Then
        assertEquals(1, mappedListProductDto.size());
        assertEquals("Mission three", mappedListProductDto.get(0).getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedListProductDto.get(0).getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedListProductDto.get(0).getMission().getMissionFinishDate());
        assertEquals(ImageryType.HYPERSPECTRAL, mappedListProductDto.get(0).getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedListProductDto.get(0).getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedListProductDto.get(0).getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedListProductDto.get(0).getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedListProductDto.get(0).getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedListProductDto.get(0).getFourthCoordinate());
        assertEquals("http//:testurlthree.com", mappedListProductDto.get(0).getProductURL());
    }
}