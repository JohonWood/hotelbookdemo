package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.Country;
import com.uestc.fff.hotel.domain.CountryExample;
import com.uestc.fff.hotel.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryManageService {
    @Autowired
    private CountryMapper countryMapper;

    public List<Country> listCountry(){
        return countryMapper.selectByExample(new CountryExample());
    }
}
