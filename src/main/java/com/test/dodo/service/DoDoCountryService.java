package com.test.dodo.service;

import com.test.dodo.model.DoDoCountriesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DoDoCountryService {

    private static final String FIND_COUNTRIES_URL = "https://globalapi.dodopizza.com/api/v1/countries/list";

    private final RestTemplate restTemplate;

    public DoDoCountriesDto findCountries() {
        return restTemplate.getForObject(FIND_COUNTRIES_URL, DoDoCountriesDto.class);
    }
}
