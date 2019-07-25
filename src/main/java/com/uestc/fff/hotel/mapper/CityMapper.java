package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.City;
import com.uestc.fff.hotel.domain.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    long countByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int deleteByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int deleteByPrimaryKey(String cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int insertSelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    List<City> selectByExample(CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    City selectByPrimaryKey(String cityId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int updateByPrimaryKeySelective(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated Thu Jul 25 10:49:07 CST 2019
     */
    int updateByPrimaryKey(City record);
}