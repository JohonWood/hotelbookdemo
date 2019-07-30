package com.uestc.fff.hotel.service;

import com.uestc.fff.hotel.domain.City;
import com.uestc.fff.hotel.domain.CityExample;
import com.uestc.fff.hotel.domain.Country;
import com.uestc.fff.hotel.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManageService {
    @Autowired
    private CityMapper cityMapper;

    public List<City> listCity(){
        return cityMapper.selectByExample(new CityExample());
    }

    public void deleteCityByID(String ID) {
        cityMapper.deleteByPrimaryKey(ID);
    }


    public List<City> searchCity(String cityName) {
        CityExample cityExample = new CityExample();
        cityExample.createCriteria().andCityNameLike("%" + cityName + "%");
        return cityMapper.selectByExample(cityExample);
    }

    public void updateCountry(City city) {
        cityMapper.updateByPrimaryKey(city);
    }

    public City findCountryByCountryCode(String cityID) {
        return cityMapper.selectByPrimaryKey(cityID);
    }

    public void saveCity(City city) {
        cityMapper.insert(city);
    }
}
