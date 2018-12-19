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
        Coordinates coordinates = new Coordinates(new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5));
        ProductDto productDto = new ProductDto(mission, LocalDate.of(2018, 12, 7), coordinates, new BigDecimal(35000.25), "http//:testurlone.com");

        //When
        Product mappedProduct = productMapper.mapToProduct(productDto);

        //Then
        assertEquals("Mission one", mappedProduct.getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedProduct.getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedProduct.getMission().getMissionFinishDate());
        assertEquals(ImageryType.PANCHROMATIC, mappedProduct.getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedProduct.getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedProduct.getCoordinates().getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedProduct.getCoordinates().getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedProduct.getCoordinates().getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedProduct.getCoordinates().getFourthCoordinate());
        assertEquals("http//:testurlone.com", mappedProduct.getProductURL());
    }

    @Test
    public void testMapToProductDto() {
        //Given
        Mission mission = new Mission("Mission two", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.MULTISPECTRAL);
        Coordinates coordinates = new Coordinates(new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5));
        Product product = new Product(mission, LocalDate.of(2018, 12, 7), coordinates, new BigDecimal(35000.25), "http//:testurltwo.com");

        //When
        ProductDto mappedProductDto = productMapper.mapToProductDto(product);

        //Then
        assertEquals("Mission two", mappedProductDto.getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedProductDto.getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedProductDto.getMission().getMissionFinishDate());
        assertEquals(ImageryType.MULTISPECTRAL, mappedProductDto.getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedProductDto.getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedProductDto.getCoordinates().getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedProductDto.getCoordinates().getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedProductDto.getCoordinates().getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedProductDto.getCoordinates().getFourthCoordinate());
        assertEquals("http//:testurltwo.com", mappedProductDto.getProductURL());
    }

    @Test
    public void testMapToProductDtoList() {
        //Given
        Mission mission = new Mission("Mission three", LocalDate.of(2018, 7, 19), LocalDate.of(2018, 11, 7), ImageryType.HYPERSPECTRAL);
        Coordinates coordinates = new Coordinates(new BigDecimal(458.85), new BigDecimal(75.21), new BigDecimal(125.63), new BigDecimal(785.5));
        Product product = new Product(mission, LocalDate.of(2018, 12, 7), coordinates, new BigDecimal(35000.25), "http//:testurlthree.com");
        List<Product> productList = new ArrayList<>();

        //When
        List<ProductDto> mappedListProductDto = productMapper.mapToProductDtoList(productList);

        //Then
        assertEquals(1, mappedListProductDto.size());
        assertEquals("Mission three", mappedListProductDto.get(0).getMission().getMissionName());
        assertEquals(LocalDate.of(2018, 7, 19), mappedListProductDto.get(0).getMission().getMissionStartDate());
        assertEquals(LocalDate.of(2018, 11, 7), mappedListProductDto.get(0).getMission().getMissionFinishDate());
        assertEquals(ImageryType.HYPERSPECTRAL, mappedListProductDto.get(0).getMission().getImageryType());
        assertEquals(LocalDate.of(2018, 12, 7), mappedListProductDto.get(0).getAcquisitionDate());
        assertEquals(new BigDecimal(458.85), mappedListProductDto.get(0).getCoordinates().getFirstCoordinate());
        assertEquals(new BigDecimal(75.21), mappedListProductDto.get(0).getCoordinates().getSecondCoordinate());
        assertEquals(new BigDecimal(125.63), mappedListProductDto.get(0).getCoordinates().getThirdCoordinate());
        assertEquals(new BigDecimal(785.5), mappedListProductDto.get(0).getCoordinates().getFourthCoordinate());
        assertEquals("http//:testurlthree.com", mappedListProductDto.get(0).getProductURL());
    }
}