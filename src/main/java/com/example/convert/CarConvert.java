package com.example.convert;

import com.example.VO.CarVO;
import com.example.dto.CarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CarConvert {
    public static final CarConvert MAPPER = Mappers.getMapper(CarConvert.class);
    abstract CarVO toVO(CarDTO carDTO);
}
