package com.example;

import com.example.convert.CarConvert;
import com.example.dto.CarDTO;
import com.example.dto.DriverDTO;
import com.example.dto.PartDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class MapstructDemoApplicationTests {
    @Test
    public void test1() {
        CarConvert mapper = CarConvert.MAPPER;
    }

    private CarDTO buildCarDTO() {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(330L);
        carDTO.setVin("vin12345678");
        carDTO.setPrice(1234567.126);
        carDTO.setTotalPrice(1432567.126);
        carDTO.setPublishDate(new Date());
        carDTO.setBrand("BMW");

        PartDTO wheel = new PartDTO(1L, "Wheel");
        PartDTO seat = new PartDTO(2L, "Seat");
        carDTO.setPartDTOS(List.of(wheel, seat));

        DriverDTO alice = new DriverDTO(1L, "Alice");
        carDTO.setDriverDTO(alice);

        return carDTO;
    }
}
