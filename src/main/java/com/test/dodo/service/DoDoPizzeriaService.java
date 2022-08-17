package com.test.dodo.service;

import com.test.dodo.model.Pizzeria;
import com.test.dodo.model.PizzeriasDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DoDoPizzeriaService {

    private static final String FIND_PIZZERIAS_URL = "https://globalapi.dodopizza.com/api/v1/pizzerias/all/";

    private final RestTemplate restTemplate;

    public PizzeriasDto findPizzeriasByCountryId(final Integer countryId) {
        return restTemplate.getForObject(FIND_PIZZERIAS_URL + countryId, PizzeriasDto.class);
    }
}
