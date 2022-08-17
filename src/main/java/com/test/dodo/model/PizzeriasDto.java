package com.test.dodo.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
@ToString
public class PizzeriasDto {
    private List<PizzeriaDto> countries;
    private List<PizzeriaDto> errors;
}
