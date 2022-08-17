package com.test.dodo;

import com.test.dodo.model.DoDoCountriesDto;
import com.test.dodo.model.DoDoCountryDto;
import com.test.dodo.service.DoDoCountryService;
import com.test.dodo.service.DoDoPizzeriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class DoDoExecutor {

    private final DoDoCountryService doDoCountryService;

    private final DoDoPizzeriaService doDoPizzeriaService;

    @PostConstruct
    public void execute() {
        final List<PizzeriasDto> result = new ArrayList<>();

        final DoDoCountriesDto doDoCountriesDto = doDoCountryService.findCountries();

        List<Integer> countryIds = new ArrayList<>();

        for (DoDoCountryDto c : doDoCountriesDto.getCountries()) {
            if (Objects.equals("Нигерия", c.getName()) ||
                    Objects.equals("Беларусь", c.getName())) {
                countryIds.add(c.getId());
            }
        }

        for (Integer id : countryIds) {
            final PizzeriasDto pizzeriasInCountry = doDoPizzeriaService.findPizzeriasByCountryId(id);
            result.add(pizzeriasInCountry);
        }

        System.out.println(result);
    }
}
