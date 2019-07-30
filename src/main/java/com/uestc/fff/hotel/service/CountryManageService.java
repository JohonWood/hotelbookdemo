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

    public void deleteCountryByCode(String code) {
        countryMapper.deleteByPrimaryKey(code);
    }

    public List<Country> searchCountry(String countryName){
        CountryExample countryExample = new CountryExample();
        countryExample.createCriteria().andCountryNameLike("%" + countryName + "%");
        return countryMapper.selectByExample(countryExample);
    }

    public Country findCountryByCountryCode(String code){
        return countryMapper.selectByPrimaryKey(code);
    }

    public void updateCountry(Country country) {
        countryMapper.updateByPrimaryKey(country);
    }

    public void saveCountry(Country country) {
        countryMapper.insert(country);
    }
}
