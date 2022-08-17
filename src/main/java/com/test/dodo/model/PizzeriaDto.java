package com.test.dodo.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class PizzeriaDto {
    private Integer countryId;
    private String countryCode;
    private String countryName;
    private List <Pizzeria> pizzerias;
}
