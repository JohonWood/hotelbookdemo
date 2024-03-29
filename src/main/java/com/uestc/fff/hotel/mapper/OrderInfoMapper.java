package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.OrderInfo;
import com.uestc.fff.hotel.domain.OrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    long countByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int deleteByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int insert(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int insertSelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    List<OrderInfo> selectByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    OrderInfo selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Sun Aug 04 09:25:55 GMT+08:00 2019
     */
    int updateByPrimaryKey(OrderInfo record);
}